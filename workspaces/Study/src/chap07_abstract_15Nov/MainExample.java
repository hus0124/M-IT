package chap07_abstract_15Nov;

public class MainExample {

	public static void main(String[] args) {
		
		// ���� Phone phone = new Phone("ȫ�浿");  new �����ڷ� ��ü�� ������ �� ����. �ν��Ͻ�ȭ �Ұ���. Phone�� �߻� Ŭ�����ϱ�.
		
		Phone phone2 = new SmartPhone("ȫ�浿");	// Phone2�� Phone ������ Ÿ���� SmartPhone ��ü.
		
		phone2.turnOn();
		phone2.turnOff();
		SmartPhone sp = (SmartPhone)phone2;		// new ���� ��ӹ��� SmartPhone Ŭ������ Phone Ŭ������ Phone2�� ����Ÿ�� ��ȯ. 
		sp.turnOn();
		sp.internetSearch("https://www.naver.com");
		sp.turnOff();
	}

}
