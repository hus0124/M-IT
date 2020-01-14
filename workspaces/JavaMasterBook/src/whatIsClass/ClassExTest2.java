package whatIsClass;

public class ClassExTest2 {	// 비로소 진정한 클래스. 캡슐화 된 필드, 함수.

	public static void main(String[] args) {
		ClassEx2 pt = new ClassEx2();
		
		// 초기화 해주기
		
		pt.setName("홍길동");
		pt.setAge(27);
		pt.setAddress("경기도 수원시");
		
		// 값 가져오기
		
		String Name = pt.getName();
		int Age = pt.getAge();
		String Address = pt.getAddress();
		
		// 결과 뷰 화면
		
		System.out.println("이름은 : " + Name);
		System.out.println("나이는 : " + Age);
		System.out.println("주소는 : " + Address);
	}

}
