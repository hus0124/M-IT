package chap07_15Nov;

public class DogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.age = 11;		// 부모가 정의한 필드.
		dog.sound();		// 자식이 재정의한 메소드
		dog.method1();		// 부모가 정의한 메소드.
		dog.furcount = 2;	// 자식이 정의한 필드.
		
		//참조변수 dog을 사용해서 접근 가능한 것 : 부모 + 자식
		
		//자동타입변환 : 부모객체가 자식 객체를 대입 받는 것.
		// 부모는 자식 것을 원래 사용못하지만 자식 객체 대입을 받으면 접근 가능. 
		
		Animal animal = dog;	// 자동타입 변환. 왼쪽은 부모 오른쪽은 자식 타입을 대입받음.
		animal.kind = "개";		// 부모가 정의한 필드
		animal.age = 12;		// 부모가 정의한 필드
		//animal.furcount = 2;	// 에러. animal 부모 참조 변수는 부모가 정의한 필드와 메소드만 접근 가능.
		//animal.method();
		animal.sound();		// 자식이 재정의한 메소드있다면 그것이 우선순위로 호출된다.
		animal.method1();

		Animal a2 = new Cat();	// 자동타입변환. 부모가 자식 객체를 대입 받음.형변환 생략 가능.
		a2.sound();			// 자식이 재정의한 메소드가 우선순위로 먼저 호출된다.
		
		// 부모 타입의 참조 변수에 어떤 자식 객체를 대입하느냐에 따라서 대입한 자식의 특징(메소드)이 실행됨. 다형성이다.
		// 자동타입 변환
		// 자식이 부모의 메소드를 재정의(오버라이드) 이런 조건이 성립되면 다형성을 이용할 수 있다.
		
		
	}

}
