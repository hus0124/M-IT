package inheritance;

public class Test_Adieu {

	public static void main(String[] args) {
		
			Adieu2019 adieu2019 = new Adieu2019(5,6);
			
			System.out.println(adieu2019.sum(9999,1));
			System.out.println(adieu2019.sum1());
			
			Adieu2019 obj1 = new Adieu2019();
			
			System.out.println(obj1.sum(33, 77));
			System.out.println(obj1.sum1());
			
			Adieu2019_2 obj2 = new Adieu2019_2();
			
			System.out.println(obj2.sum(11, 44));
			System.out.println(obj2.sum1());
			System.out.println(obj2.sub(44, 11));
			
			Adieu2019 obj3 = new Adieu2019_2();	// 자식 객체를 부모 타입 변수에 대입
			System.out.println(obj3.sum1());
			System.out.println(obj3.sum(55,44));	// 재정의했기에 동일한 이름의 메소드가 있어서 작동은 됨. 단 자식 타입으로 작동.
			//obj3.dog = 4; 부모 클래스에는 없는 필드라서 접근이 안 됨.
			obj2.dog = 5;
	}

}
