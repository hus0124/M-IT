package chap08;
//인터페이스 구현한다. implements 
	// 상속관계는 extends 
	// 인터페이스는 여러개 다중 구현 가능하다. 상속은 단일 상속.	
	
	//Interface RemoteControl 에서 정의한 추상 메소드를 재정의(필수)
public class Television implements RemoteControl { // [, HardDisk] 여러 개를 사용 가능 
	// 필드
	int channel;
	
	// 생성자
	
	// 메소드
	public void changeChannel(int channel){
		this.channel = channel;
	}
	
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
		System.out.println("텔레비전 볼륨을 " + volume + "으로 설정");

	}
	
		
	// 디폴트 메소드와 정적 메소드는 어쨌든 인터페이스에서 구현했으므로 인터페이스 구현한 클래스가 가지고 있다. 초기에 보이지만 않는 상태.
}
