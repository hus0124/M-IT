
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

	void exec2(ExecInterface eee) { //�������̽� ������ ��ü�� �� ���� �� �ִ�. 
		int a = 5;
		int b = 6;
		
		int sum = eee.add(a, b); // �Ű����� ��ü���� ������ add �� ����ȴ�.
		System.out.println(sum);
	}
}
