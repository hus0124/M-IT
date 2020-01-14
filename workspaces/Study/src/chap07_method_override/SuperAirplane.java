package chap07_method_override;

public class SuperAirplane extends Airplane {
	int mode;	// 모드 1 일반 , 모드 2 초음속
	
	public void setMode(int mode){
		this.mode = mode;
	}
	
	@Override	// 어노테이션 : 컴파일러에게 부모 클래스의 메소드 선언부와 동일한지 검사 지시. 
	public void fly() {
		if(mode==1)
		super.fly();	// 일반비행
		else
			System.out.println("초음속 모드 비행");
	}
	
}
