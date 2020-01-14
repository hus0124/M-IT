package chap08;

public class AbstractExample {

	public static void main(String[] args) {
		
//		에러 작동안됨 Aclass a = new Aclass(); Aclass 는 추상클래스라서 상속만 되고 객체 생성이 불가능.
		
		Bclass b = new Bclass();	// Bclass는 추상클래스를 상속했으므로 객체 생성 가능.
		
		b.method1();
		b.method2();
		
//		Cclass c = new Cclass(); 에러, 작동안됨. Cclass도 추상클래스.

		Dclass d = new Dclass();	// Dclass는 Aclass를 상속 받은 추상 클래스 Cclass를 상속 받음.
		d.method1();
		d.method2();
	}

}
