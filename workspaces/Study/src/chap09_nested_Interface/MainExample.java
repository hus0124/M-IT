package chap09_nested_Interface;

public class MainExample {

	public static void main(String[] args) {
		
		Button button1 = new Button();	//���̹� ���� ��ư
		Button button2 = new Button();	//��ȭ ��ư
		
		button1.setOnClickListener(new Internet());
		button1.touch();	// ���� ��ü�� �޼ҵ� ȣ��
		button2.setOnClickListener(new Call());
		button2.touch();	// ���� ��ü�� �޼ҵ� ȣ��
		
		

	}

}
