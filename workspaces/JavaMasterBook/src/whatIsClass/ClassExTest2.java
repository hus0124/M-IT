package whatIsClass;

public class ClassExTest2 {	// ��μ� ������ Ŭ����. ĸ��ȭ �� �ʵ�, �Լ�.

	public static void main(String[] args) {
		ClassEx2 pt = new ClassEx2();
		
		// �ʱ�ȭ ���ֱ�
		
		pt.setName("ȫ�浿");
		pt.setAge(27);
		pt.setAddress("��⵵ ������");
		
		// �� ��������
		
		String Name = pt.getName();
		int Age = pt.getAge();
		String Address = pt.getAddress();
		
		// ��� �� ȭ��
		
		System.out.println("�̸��� : " + Name);
		System.out.println("���̴� : " + Age);
		System.out.println("�ּҴ� : " + Address);
	}

}
