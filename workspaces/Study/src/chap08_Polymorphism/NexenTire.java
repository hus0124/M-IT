package chap08_Polymorphism;

public class NexenTire implements Tire {

	// 필드 : Tire 인터페이스에서 정의됨 -> 다른 클래스에서 구현된다.
	
	String location;
	int maxRotation;
	int accmulatedRotation;
	
	// 생성자
	public NexenTire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// Tire 인터페이스의 추상 메소드 재정의
	// 바퀴 동작 : 수명, 누적회전수, 펑크 유무, 장착 위치를 반환.
	@Override
	public boolean roll() {
		accmulatedRotation++;	// 바퀴가 회전
		if(accmulatedRotation < maxRotation){
			System.out.println(location + " NexenTire 남은 수명: " + (maxRotation - accmulatedRotation));
			return true;
		}
		else{
			System.out.println("*** " + location + " NexenTire 펑크 ***");
			return false;
		}
		
	}

}
