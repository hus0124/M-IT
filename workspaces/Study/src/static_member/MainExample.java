package static_member;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = Calculator.plus(10, 20);	// 객체 생성 없이 바로 접근 
		System.out.println("result= " + result);
		
		System.out.println("원의 면적 : " + Calculator.calcularea(5.0));
		System.out.println("result= " + Calculator.minus(30, 20));
		
		

	}

}
