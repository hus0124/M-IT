package JavaTestReady;
/*
  아래 회원정보를 가지는 Member 클래스에 대하여 필드를 private 접근 제어자를 사용하고, 
 Getter와 Setter 메소드를 정의하여 Member.java 파일을 작성하시오.

데이터이름		필드이름		타입
이름			name		문자열
아이디		id			문자열
패스워드		password	문자열
성인여부		adult	논리(boolean)

 */
public class GetterSetterMember {

	private String name;
	private String id;
	private String password;
	private boolean adult;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdult() {	// boolean getter는 is 
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
}
