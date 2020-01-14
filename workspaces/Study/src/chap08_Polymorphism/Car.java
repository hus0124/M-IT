package chap08_Polymorphism;

public class Car {
	Tire fl = new HankookTire("전면좌측", 5);
	Tire fr = new HankookTire("전면우측", 3);
	Tire bl = new NexenTire("후면좌측", 4);
	Tire br = new NexenTire("후면우측", 6);
	
	// 운행 메소드
	// 타이어 회전하면서 운행 : 수명, 펑크 정보 알려줌
	public int run(){
		System.out.println("운행시작");
		if(!fl.roll()){	// 펑크 발생하면
			System.out.println("앞왼쪽 바퀴 펑크");
			stop();
			return 1;	// 고장난 위치
		}
		if(!fr.roll()){	// 펑크 발생하면
			System.out.println("앞오른쪽 바퀴 펑크");
			stop();
			return 2;	// 고장난 위치
		}
		if(!bl.roll()){	// 펑크 발생하면
			System.out.println("뒤왼쪽 바퀴 펑크");
			stop();
			return 3;	// 고장난 위치
		}
		if(!br.roll()){	// 펑크 발생하면
			System.out.println("뒤오른쪽 바퀴 펑크");
			stop();
			return 4;	// 고장난 위치
		}
		return 0;
	}
	
	
	public void stop(){
		System.out.println("운행정지");
	}
}
