
public class AClass {
	
	void exec() {
	
	int a = 4;
	int b = 7;
	
	BClass bclass = new BClass();
	ExecInterface ffclass = new CClass();
	int sum1 = ffclass.add(a, b);
	int sum = bclass.add(a, b);
	System.out.println(sum);
	System.out.println(sum1);
		
	}

	void exec2(ExecInterface eee) { //인터페이스 구현한 객체는 다 받을 수 있다. 
		int a = 5;
		int b = 6;
		
		int sum = eee.add(a, b); // 매개변수 객체에서 구현된 add 가 실행된다.
		System.out.println(sum);
	}
}
