package chap08;

public class TelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		// tv.MAX_VOLUME = 20;
		// tv.MIN_VOLUME = 10; 인터페이스 상에서 상수이기 때문에 변수처럼 바꾸지 못한다.
		tv.turnOn();		
		tv.setVolume(10);	// 추상메소드
		tv.setMute(true);	// 무음처리(default 메소드)
		tv.setMute(false);
		tv.turnOff();
		
		RemoteControl.changeBattery();		//정적 메소드. 정적이므로 클래스 이름 통해 접근.
		
		// 클래스에서 자동타입변환 : 부모 클래스 타입에 자식클래스 객체를 대입받는 것. 
		// 인터페이스 : 자동타입변환 (인터페이스에 구현 클래스 객체를 대입받는것)
		
		RemoteControl rc = new Television();	// remoteControl 인터페이스 타입에 구현 클래스 객체 Television 을 대입받는 것.
		rc.setMute(true);
		rc.setVolume(20);
		// rc.changeChannel(07); 불가능. 구현된 텔레비전 클래스에서 정의한 메소드이므로 원본 인터페이스 타입으로 접근이 불가능. 
		// rc.channel = 08; 불가능. 클래스에서 정의된 필드에 접근 안 됨. 인터페이스 타입이니 인터페이스에서 정의한 것만 접근됨.
				
		Television t = (Television)rc;		// 강제타입변환. 이것도 rc가 자동타입변환 되었기에 가능한 것. 아니면 불가능.
		
		t.channel = 9;
		t.changeChannel(14);	// 클래스에서 만든 것
		t.setVolume(5);			// 인터페이스 추상 메소드를 재정의한 것. 접근 가능.
		t.setMute(false);		
		
		
		if(rc instanceof Television){		// 상속 때랑 똑같이 instanceof 사용해서 강제타입변환 여부를 확인해볼 수 있다. 
			Television t2 = (Television)rc;
			System.out.println("텔레비전 클래스로 강제타입변환 가능");
		}
		else if(rc instanceof AirCon){
			AirCon a = (AirCon)rc;
			System.out.println("에어컨 클래스로 강제타입변환 가능");
		}
		
		// AirCon a = (AirCon)rc; 주의!! 가능한 것 처럼 보이지만 에러. ClasscastException 예외 발생
		// 원래 rc는 Television 클래스.
	}

}
