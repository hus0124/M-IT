package singleton;

import java.util.Calendar;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SingleTon s = new SingleTon(); ��ü ������ �� ��. �ٸ� Ŭ�������� ������ �Ұ���.
		
		// SingleTon Ŭ������ private. instance�� private.
		// SingleTon �� ���� ������ instance. instance�� ���� ������ getInstance. 
		System.out.println("ȣ����");
		SingleTon s1 = SingleTon.getInstance(); 
		s1.data[0] = 10;
		
		System.out.println(s1.data[0]);
		Calendar now = Calendar.getInstance();	// Calendar ��� �̱��濡 getInstance�� ����.
		
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int num = 10;
		for (int i = 0; i < 10; i++){
			
			s1.data[i] = num++;
		}
		
		for (int i = 0; i < 10; i++){
			System.out.println(s1.data[i]);
		}
		
		// SingleTon s2 = new SingleTon();
		// �̱��� ó���̹Ƿ� new �� ��ü ���� ������ ���ϰ� �ȴ�.

	}

}
