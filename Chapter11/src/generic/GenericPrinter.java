package generic;

public class GenericPrinter<T extends Material>{
							//상위 클래스 상속 받은 애들만 재료변수로 사용할 수 있게 상위 클래스를 만들어서 이용하자(Material)
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}

}
