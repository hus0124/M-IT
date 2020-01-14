package chap07_Exercise;

public class SnowTireExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		Tire tire1 = new Tire();	// tire1 은 부모 타입
		tire1 = snowTire;			// 부모 타입 객체를 자식 타입 snowTire로 강제 형변환.
		
		snowTire.run();		// 자식 클래스 SnowTire 가 부모 클래스 타입으로 자동형변환. 자식 클래스의 run() 먼저 작동된다.
		tire.run();
		tire1.run();	// 강제 형변환 하여 자식 클래스 메소드가 작동.
		
		if(tire1 instanceof SnowTire){
			System.out.println("객체타입확인");	// instanceof 통해 자식 타입 확인. 강제 타입 변환 가능하다는 것을 확인.
		}
		
	}

}
