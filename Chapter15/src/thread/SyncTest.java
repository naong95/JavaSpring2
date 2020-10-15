package thread;

class Bank{
	private int money = 10000;
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void saveMoney(int save) {
		
		synchronized(this) { //this에 동기화 설정, 어느 객체에 락을 걸지 섬세하게 지정할 수 있다
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m + save);
		}
	}
	public synchronized void minusMoney(int minus) { //싱크로나이즈 메서드, 먼저 시작한 쓰레드에 접근 불가
		
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
}

class Park extends Thread{ //동기화는 크리티컬 섹션에 걸어야됨 run에다가 걸어봤자 의미가 없다, 걸고 싶으면 메서드 말고 수행문으로 지정 동기화
	
	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000);
		System.out.println("save money: "+SyncTest.myBank.getMoney());
	}
}

class ParkWife extends Thread{
	
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("minus money: "+SyncTest.myBank.getMoney());
	}
}

public class SyncTest {

	public static Bank myBank = new Bank();
	
	
	public static void main(String[] args) throws InterruptedException {

		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();
	}

}
