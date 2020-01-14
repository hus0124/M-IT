package Instanceof_CollectionType;

public class FooServiceTest {

	public static void main(String[] args) {
		// FooService obj = new FooService("Hello"); // 이럴거면 인터페이스 추상클래스 만드는게 무의미
		
		AbstractBaseService obj1 = new FooService("Hello");
		BaseService obj2 = new FooService("Hello");
		// 컬렉션 타입. 상위에 있는 클래스 타입으로 갖다 쓰는 것
		
		Object obj3 = new FooService("Hello");
		
		System.out.println(obj3 instanceof FooService);
		System.out.println(obj3 instanceof AbstractBaseService);
		System.out.println(obj3 instanceof BaseService);
		System.out.println(obj3 instanceof Integer);	// 전혀 다른 integer 그냥 넣어봄.
	}

}
