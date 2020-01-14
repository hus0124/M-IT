package chap09_nested_Interface;
//중첩 인터페이스
// 인터페이스 타입 필드 선언. 구현 객체 선언. 
// 필드에 setter 사용해서 생성자 선언
// 구현 객체의 메소드 호출.
// 중첩 인터페이스 선언. 메소드 포함.

public class Button {
//필드 : 인터페이스 선언
	OnClickListener listen;

// 세터 : 매개변수의 다형성 담당
	public void setOnClickListener(OnClickListener listen){
		this.listen = listen;
	}
	
// 메소드 : 메인 동작
	void touch(){
		listen.onClick();
	}
//중첩 인터페이스	
	interface OnClickListener {
	void onClick();	// 추상메소드
}
}