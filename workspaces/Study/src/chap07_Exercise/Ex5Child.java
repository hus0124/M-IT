package chap07_Exercise;

public class Ex5Child extends Ex5Parent {

	private int studentNo;
	
	public Ex5Child(String name, int studentNo){
		// �̰͸� ���� ���� ���� this.name = name;
		
		super(name);		// �θ� Ex5Parent �� ������ ȣ���ؼ� �ʱ�ȭ�Ѵ�.
		
		this.studentNo = studentNo;
	}
}
