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
		// this( ) �� �ȿ� �ִ� ����� ������ ���� �̿ܿ� �� �ְ� ���� �� ����ϴ� ��.
		this.id = id;
		this.name = name;
		this.password = password;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	

}
