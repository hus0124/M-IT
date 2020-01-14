package getter;

public class Member {
	
	private String id;
	private String name;
	private String pw;
	private String phone;
	private String email;
	private boolean gender;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(String age) {	// int -> string 전환
		this.age = Integer.parseInt(age);
	}
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Member(){};
	
	public Member(String id, String name, String pw, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
	}
	
	// 화면 우클릭 → source → Generate Constructor getter setter 로 원하는 필드 선택해서 getter setter 생성 가능.
	
	public String getId() {
		return id;
	}

	public void setId(String id) {	//영문 숫자 조합 7자이상 조건 걸기
		if(id.length() < 7)
			System.out.println("영문 숫자 조합 7자 이상 입력하세요");
		// 정규표현식 사용해서 파라미터가 규칙대로 입력되었는지 확인한 후 통과되면 저장
		// 그렇지 않으면 저장하지 않고 잘못된 점을 알려준다.
		else if(id.isEmpty())
			System.out.println("아이디를 입력하세요");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
