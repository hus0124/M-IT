package chap08_anonymous;

public class MainExample {

	public static void main(String[] args) {
		// 텔레비전 구현 객체를 사용 -> 객체의 이름이 없음. 생성자를 못 만듬. 익명 구현 객체 필요.
		
		// 이렇게 못함 RemoteControl r = new Television();
		
		// 익명 객체는 클래스 이름이 없다. 클래스 이름이 없으므로 생성자를 인터페이스 이름으로 사용한다. 
		
		RemoteControl rc = new RemoteControl(){
			// 구현 객체 : RemoteControl 을 implement (구현)
			// 블럭 부분이 클래스 블럭이므로 필드, 메소드, 생성자 있어야 하지만 클래스 이름은 없으니 생성자는 제외.
			
			int field1 = 20;
			void method1(){
				turnOn();
			}
			
			// 익명이라도 어쨌든 구현(implement) 객체이므로 인터페이스 클래스의 추상메소드를 재정의한다.
			@Override
			public void turnOn() {
				System.out.println("텔레비전을 켭니다");
				
			}
			@Override
			public void turnOff() {
				System.out.println("텔레비전을 끕니다");
				
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨을  " + volume + "으로 설정");
				
			}
		};			// default 메소드도 존재 (setVolume)

		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		//	rc.field1 = 20; 익명 구현 객체 안에서만 접근 가능. 밖에선 불가능.
		//  rc.method1();
		
		// 클래스 이름이 없으니 강제 타입 변환도 불가능
		
		RemoteControl audio = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("오디오 볼륨을 " + volume + "로 조절");
						
			}
		};
		
		audio.turnOn();			// 인터페이스의 추상 메소드 재정의만 할 뿐. 쓰려면 호출해야 한다.
		audio.setVolume(30);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		RemoteControl.changeBattery();
	}

}
