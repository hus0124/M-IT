package chap07_abstract_15Nov;

public class SmartPhone extends Phone {

	public SmartPhone(String owner){
		super(owner);	// 부모 클래스 Phone 에 대한 생성자 호출.
	}
	
	public void internetSearch(String url){
		System.out.println(url + "을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}

	

	
	
	// 상속 받을 자식은 부모 클래스에 추상 메서드가 있다면 반드시 재정의 해주어야 한다. 
	 @Override
	public void sendMessage(String message){}
	
	//부모 클래스의 추상 메서드를 자식 클래스가 재정의 해야 하지만 재정의 안 하고 자식 클래스가 다시 추상 메서드, 추상 클래스로 변할 수도 있다. 
	// public abstract class SmartPhone extends Phone { 서두 부분이 이렇게 변하면 된다.
	// 그리고 아래부분 추상 메서드를 정의한다. public abstract void sendMessage(String message);
	 // 이렇게 되면 추상 클래스라서 new 연산자로 객체 생성 못하게 된다.
}
