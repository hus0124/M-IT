package chap11_LogicalCompare;

public class Member {
	String id;
	String pw;
	
	public Member(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	@Override			//toSring을 재정의하면서 출력 방법 다르게 해줄 수 있다.
	public String toString() {
		return "id:" + id + ", pw: " + pw;
	}
	
	@Override			//hashcode 오버라이드 재정의
	public int hashCode() {
		return Integer.valueOf(pw);
	}
	
	@Override
	public boolean equals(Object obj) {		// Object는 모든 것들의 부모 클래스. 부모 클래스를 대입 받는 것과 같다.
		Member m = (Member)obj; 	// 부모클래스 obj를 자식 Member 타입으로 강제 타입 변환. 부모 상태에선 자식 쪽에 접근 제한이라서.
									// obj는 메인클래스에서 결국 m2 객체. 자식클래스 Member에서 만들어짐. 강제형변환 가능.
		if(id.equals(m.id) && pw.equals(m.pw))
		return true;
		else
			return false;
	}
}
