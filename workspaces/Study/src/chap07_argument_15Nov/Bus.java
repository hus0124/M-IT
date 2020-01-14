package chap07_argument_15Nov;

public class Bus extends Vehicle {
	
	@Override // 어노테이션 : 컴파일러가 override 알게 해 줌.
	public void run() {
		System.out.println("버스가 달립니다");
	}

}
