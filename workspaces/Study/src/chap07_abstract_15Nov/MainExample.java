package chap07_abstract_15Nov;

public class MainExample {

	public static void main(String[] args) {
		
		// 에러 Phone phone = new Phone("홍길동");  new 연산자로 객체를 생성할 수 없다. 인스턴스화 불가능. Phone은 추상 클래스니까.
		
		Phone phone2 = new SmartPhone("홍길동");	// Phone2는 Phone 데이터 타입의 SmartPhone 객체.
		
		phone2.turnOn();
		phone2.turnOff();
		SmartPhone sp = (SmartPhone)phone2;		// new 말고 상속받은 SmartPhone 클래스로 Phone 클래스의 Phone2를 강제타입 변환. 
		sp.turnOn();
		sp.internetSearch("https://www.naver.com");
		sp.turnOff();
	}

}
