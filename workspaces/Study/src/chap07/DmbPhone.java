package chap07;

public class DmbPhone extends CellPhone {	// 하나의 자식이 하나의 부모만 상속. extends + 클래스 이름으로 사용.
	// 자식은 상속한 필드와 메소드(부모가 선언한 것들)를 사용 가능.(자식 필드에 안 보여도 존재함)

	int channel;	// 자식 클래스만의 고유 필드
	
	// 생성자 선언 따로 없으니 디폴트 생성자
	
	public DmbPhone(){
		// super(); 부모 생성자가 먼저 호출되므로 cellphone 호출 먼저 된다.
		System.out.println("DmbPhone() 생성자 호출됨");
	}
	
	public DmbPhone(String model, String color, int channel){
		super(model, color);
		this.channel = channel;
		System.out.println("DmbPhone(model,color,channel) 생성자 호출됨");
	}
	
	public void method(){
		model = "갤8";		// 부모 필드와 메소드 선언도 없이 그냥 사용 가능.
		powerOn();
	}
	
	public void changeChannel(int ch){
		channel = ch;
		
	}
	
	public void dmb_powerOn(){		// 부가적으로 기능 추가
		System.out.println("DMB 전원을 켭니다");
	}
	
	public void dmb_powerOff(){
		System.out.println("DMB 전원을 끕니다");
	}
}
