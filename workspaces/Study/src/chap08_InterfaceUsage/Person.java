package chap08_InterfaceUsage;

public class Person {
	// 객체니까 필드, 생성자, 메소드 다 있음
	
	RemoteControl sb;	// 필드로 인터페이스를 사용해서 선언. 주소를 저장하는 참조 변수처럼 사용 가능. 생성자에 끌어오려고 만듬.
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	//생성자
	Person(RemoteControl rc){
		this.sb = rc;
	}
	
	//메소드
	public void watchMovie(){
		RemoteControl rc = new SettopBox();
		rc.turnOn();
		SettopBox s = (SettopBox)rc;
		s.showMovie("스타워즈");
	}
	
	// 메소드의 매개변수로 인터페이스를 사용한다(다형성). 매개변수로 클래스를 사용했던 것과 동일.
	
	public void method3(RemoteControl rc){
		rc.turnOn();
		rc.setVolume(30);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
	}

}
