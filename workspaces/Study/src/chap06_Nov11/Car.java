package chap06_Nov11;

public class Car {	// public : 접근제한자. 외부에서 접근 가능. 사용할 수 있다. 

	public class Handle{}  // 중첩클래스도 가능.
}

// public class Tire {} 는 생성 불가. Car.java 라는 파일에서는 다른 클래스를 public 을 허용하지 않음.
class Tire{}	// public 하지 않은 클래스는 허용. public 이 없는 것은 접근제한자 default. 이것은 허용된다.
				// default 접근 제한자는 같은 패키지 내에서만 접근 가능. study.chap06_Nov11 패키지에서 허용된다. 

class Engine{}

