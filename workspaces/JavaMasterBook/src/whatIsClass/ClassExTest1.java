package whatIsClass;

public class ClassExTest1 {

	public static void main(String[] args) {
		ClassEx1 pt = new ClassEx1("ȫ�浿",27,"��⵵ ������");
		
		String Name= pt.Name;		// �̰� �ݵ�� �� �־�� �Ѵ�. �� ������ �ʼ�. �Է°��� ���ʿ� �־��ֱ�.
		int Age = pt.Age;
		String Address = pt.Address;
		
		System.out.println("�̸��� : " + Name);
		System.out.println("���̴� : " + Age);
		System.out.println("�ּҴ�: " + Address);
	}

}
