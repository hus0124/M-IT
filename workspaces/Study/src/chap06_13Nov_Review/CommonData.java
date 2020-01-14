package chap06_13Nov_Review;

public class CommonData {
	
	private static final int MAX_MEMBER = 300;

	private CommonData(){} // 클래스 이름으로 private 생성자 만들고
	
	private static CommonData instance = new CommonData();	// 유일하게 접근 가능한 instance 객체 생성
	
	public static CommonData getInstance(){
		return instance;
	}
	
	Member data[] = new Member[MAX_MEMBER];
	int count = 0;
	
}
