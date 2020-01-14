package chap06_13Nov_Review;

public class CommonData {
	
	private static final int MAX_MEMBER = 300;

	private CommonData(){} // Ŭ���� �̸����� private ������ �����
	
	private static CommonData instance = new CommonData();	// �����ϰ� ���� ������ instance ��ü ����
	
	public static CommonData getInstance(){
		return instance;
	}
	
	Member data[] = new Member[MAX_MEMBER];
	int count = 0;
	
}
