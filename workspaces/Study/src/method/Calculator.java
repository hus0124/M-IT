package method;

public class Calculator {
	public int add(int a, int b){
		System.out.println("정수형 더하기");
		return a + b;
	}
	
	public double add(double d1, double d2){
		System.out.println("실수형 더하기");
		return d1 + d2;
	}
	
	// 메소드 오버로딩. 메소드 이름, 리턴타입 무관. 매개변수의 타입, 개수, 순서가 다르다. 생성자 오버로딩과 동일.
	// ctrl + space 누르면 나오는 많은 동일 네임 메소드들이 바로 오버로딩. 

}
