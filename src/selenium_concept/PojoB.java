package selenium_concept;

public class PojoB {
	public static void main(String[] args) {
		PojoA p = new PojoA();
		p.setA(17);

		int a = p.getA();
		System.out.println(a);
	}
}
