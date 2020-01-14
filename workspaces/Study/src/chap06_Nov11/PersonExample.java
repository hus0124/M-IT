package chap06_Nov11;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println("키 : " + p1.height);	// Person 클래스에서 초기화해줌. 10.0
		System.out.println("이름 : " + p1.name);	// Person 클래스에서 초기화안함. null
		
		// height = 20.0 이렇게는 못 바꿈
		p1.height = 20.0;
		System.out.println("키 : " + p1.height);	// 만든 객체 p1 값은 바뀔 수 있으나 원본 height는 못 건드림.

	}

}
