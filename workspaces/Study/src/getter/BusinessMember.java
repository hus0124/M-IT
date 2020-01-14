package getter;

public class BusinessMember extends Member {
// 부모가 정의한 필드, 생성자, 메소드 존재하고 사용 가능
	// 부모가 정의한 메소드를 나만의 메소드로 정의
	
	//override 재정의. 부모가 정의한 메소드를 나만의 방법으로 재정의
	
	@Override	// @ Annotation 어노테이션 의미.
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
}
