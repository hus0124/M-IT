package chap07_Exercise;

public class SnowTire extends Tire {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run(); 이 부분이 만일 있다면 오버라이딩 해도 부모 메소드가 실행된다.
		System.out.println("스노우 타이어가 굴러갑니다");
	}
}
