package Instanceof_CollectionType;

public class FooServiceTest {

	public static void main(String[] args) {
		// FooService obj = new FooService("Hello"); // �̷��Ÿ� �������̽� �߻�Ŭ���� ����°� ���ǹ�
		
		AbstractBaseService obj1 = new FooService("Hello");
		BaseService obj2 = new FooService("Hello");
		// �÷��� Ÿ��. ������ �ִ� Ŭ���� Ÿ������ ���� ���� ��
		
		Object obj3 = new FooService("Hello");
		
		System.out.println(obj3 instanceof FooService);
		System.out.println(obj3 instanceof AbstractBaseService);
		System.out.println(obj3 instanceof BaseService);
		System.out.println(obj3 instanceof Integer);	// ���� �ٸ� integer �׳� �־.
	}

}
