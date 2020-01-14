package chap08_InterfaceUsage;

public class TodaySchedule {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");	// 필드의 다형성을 통해 여러개의 객체에 접근할 수 있다.
		
		p1.sb = new Television();	//sb는 person 클래스에서 선언했던 참조변수 = 인터페이스. 필드로 인터페이스 활용. 필드의 다형성.
		p1.sb.turnOn();
		p1.sb.setMute(true);
		p1.sb.setMute(false);
		p1.sb.turnOff();
		System.out.println();
		
		p1.sb = new SettopBox();
		p1.sb.turnOn();
		p1.sb.setMute(true);
		p1.sb.setMute(false);
		p1.sb.turnOff();
		System.out.println();
		
		p1.method3(new Television());	// person 클래스의 메소드3. 인터페이스를 매개변수로 하는 메소드. 매개변수의 다형성.
		System.out.println();
		p1.method3(new SettopBox());	// 인터페이스 구현한 클래스 객체들이 들어갈 수 있다.
		System.out.println();
		
		p1.watchMovie();
		
		RemoteControl.changeBattery(); // 인터페이스의 정적 메소드. 인터페이스 이름으로 접근. 
		

	}

}
