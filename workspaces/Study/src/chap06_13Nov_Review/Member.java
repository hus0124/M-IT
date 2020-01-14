package chap06_13Nov_Review;

public class Member {
	private String id;
	private String name;
	private String password;
	private String phoneNum;
	private String email;
	/**
	 * @param id
	 * @param name
	 * @param password
	 * @param phoneNum
	 * @param email
	 */
	public Member(String id, String name, String password, String phoneNum, String email) {
		super();
		// this( ) 이 안에 넣는 용법은 지정된 변수 이외에 더 넣고 싶을 때 사용하는 것.
		this.id = id;
		this.name = name;
		this.password = password;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	

}
