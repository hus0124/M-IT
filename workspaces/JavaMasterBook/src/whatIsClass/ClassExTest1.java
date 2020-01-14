package whatIsClass;

public class ClassExTest1 {

	public static void main(String[] args) {
		ClassEx1 pt = new ClassEx1("홍길동",27,"경기도 수원시");
		
		String Name= pt.Name;		// 이걸 반드시 해 주어야 한다. 이 과정이 필수. 입력값을 왼쪽에 넣어주기.
		int Age = pt.Age;
		String Address = pt.Address;
		
		System.out.println("이름은 : " + Name);
		System.out.println("나이는 : " + Age);
		System.out.println("주소는: " + Address);
	}

}
