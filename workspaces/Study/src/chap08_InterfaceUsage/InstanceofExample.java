package chap08_InterfaceUsage;

public class InstanceofExample {

	public static void main(String[] args) {
		RemoteControl rc = new SettopBox();	// 인터페이스 타입 변수 이름 = 구현 객체 이름, 자동타입변환
//		에러 rc.volume(10); 구현 객체의 필드에는 접근이 안 됨. 강제 타입 변환 필요.
		
		SettopBox sb = (SettopBox)rc;	// 강제 타입 변환이 가능한 이유는 rc 가 new SettopBox로 자동타입변환 했기 때문
		
//		에러 Television tv = (Television)rc;  되는 것처럼 보이지만 에러. class cast exception.
		
		if(rc instanceof Television){
			System.out.println("Television로 강제타입변환 가능");
			Television tv = (Television)rc;
		}
		else if(rc instanceof SettopBox){
			System.out.println("SettopBox로 강제타입변환 가능");
			SettopBox s2 = (SettopBox)rc;
		}
	}

}
