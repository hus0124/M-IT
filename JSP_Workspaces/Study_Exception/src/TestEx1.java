
public class TestEx1 {
	int exec() {
		int a = 1;
		int b = 0;
		int sum = 0;
		
		try {
		
			sum = a/b; //���� �߻�
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("exec �޼ҵ� ���� �߻�");
			return a;
		}
		finally {
			System.out.println("���� �߻� ��� ���� ������ ���");
			
		}
		
		System.out.println("finally ������ ������ �ȴ�!");
		return sum;
	}
}
