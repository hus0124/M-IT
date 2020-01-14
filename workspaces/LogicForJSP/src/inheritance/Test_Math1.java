package inheritance;

public class Test_Math1 {

	public static void main(String[] args) {
		Math1 math1 = new Math1();
		int num = math1.allsum(100,1);
		System.out.println(num);
		int num2 = math1.allsum(255,3000);
		System.out.println(num2);
		System.out.println("----자식 클래스----");
		
		Math2 math2 = new Math2();
		System.out.println(math2.allsum(100, 1));
		System.out.println(math2.allsum(255, 3000));
		System.out.println(Math2.max(100, 1));
		System.out.println(Math2.max(255, 3000));
	}

}
