package chap09_nested_Interface;

public class MainExample {

	public static void main(String[] args) {
		
		Button button1 = new Button();	//네이버 접속 버튼
		Button button2 = new Button();	//전화 버튼
		
		button1.setOnClickListener(new Internet());
		button1.touch();	// 구현 객체의 메소드 호출
		button2.setOnClickListener(new Call());
		button2.touch();	// 구현 객체의 메소드 호출
		
		

	}

}
