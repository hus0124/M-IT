package chap08_InterfaceReview;

public class ServerExample {

	public static void main(String[] args) {
		ClassA oracle = new ClassA(new OracleDB());
		oracle.insert();
		
		ClassA maria = new ClassA(new MariaDB());
		maria.insert1();		// classA ���� insert�� insert1 �� ���� ���������� �۵�.
		maria.insert();		// �Ǵ� ��ó�� �������� ����. ������Ʈ�ͼ���.
	}
	
}
