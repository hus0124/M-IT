package chap08_MultiInterface;

public class SmartTVExample {

	public static void main(String[] args) {
		SmartTV st = new SmartTV();
		
		RemoteControl rc = new SmartTV();
		
		rc.turnOn();
		rc.setVolume(10);
		// 에러 불가능 rc.search();	RemoteControl 타입이라서
		
		Searchable s = (Searchable)rc;	// 강제형변환 가능. rc는 serchable 구현한 smartTV 객체 대입이므로.
		s.search("https://www.naver.com");
		rc.turnOff();

	}

}
