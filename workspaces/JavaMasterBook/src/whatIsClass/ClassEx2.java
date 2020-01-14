package whatIsClass;

public class ClassEx2 {	// 비로소 진정한 클래스. 캡슐화 된 필드, 함수.
	private String Name;
	private int Age;
	private String Address;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	// 디폴트 생성자. 생략 가능. public ClassEx2(){}
}
