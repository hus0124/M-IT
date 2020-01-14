package chap07_abstract_15Nov;
// 추상 클래스 : 표준화된 클래스 정의 (여러가지 클래스의 공통 특성을 정의)
/*
 * Phone : galaxy note tablet 
 * 나라 : 인도(가격) 중국(가격 성능) 한국(새로움)
 * 표준화된 클래스를 정의한 후 (추상 클래스)
 * 모델별로 각 나라별로 실체 클래스를 만들어서 개발하면 개발의 효율화
 * abstract 키워드를 사용
 * new 연산자로 객체를 생성할 수 없다. 추상 클래스를 상속한 자식 클래스만 생성 가능.  
 */
public abstract class Phone {

	private String owner;

	public Phone(String owner){
		this.owner = owner;
	}
	
	public void turnOn(){
		System.out.println("폰 전원을 켭니다");
		
	}
	
	public void turnOff(){
		System.out.println("폰 전원을 끕니다");
	}
		
		public abstract void sendMessage(String message);		//추상메서드. 상속받은 자식이 반드시 구체 실현 해야 한다.
			
		
	}
	
	

