package chap07_field_15Nov;

public class Tire {
	public int maxRotation;		// 일종의 수명
	public int accumulatedRotation; // 누적 회전수
	
	public String location; 	// 장착 위치

	//생성자
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll(){	// 타이어 굴러가는 기능
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation){
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation));
			return true;
		}
		else{
			System.out.println("*** " + location + "타이어 펑크***");
			return false;
		}
	}

}
