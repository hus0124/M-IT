package getter;

public class GetterExample {

	// getter setter ������ ��ȣ, ������ �����Ͱ� ������� �ʰ�
	// ���� ���� ����ϸ� �̻��� �����Ͱ� �����.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = new Member("Hong", "ȫ�浿", "1234", "1111", "hong@naver.com");
		
		Member lee = new Member();
		lee.setId("lee");
		lee.setName("�̼���");
		lee.setPw("1234");
		lee.setPhone("2222");
		lee.setEmail("lee@gmail.com");
		
		System.out.println("���̵�" + member.getId());
		System.out.println("�̸�" + member.getName());
		System.out.println("��й�ȣ" + member.getPw());
		System.out.println("��ȭ��ȣ" + member.getPhone());
		System.out.println("�̸���" + member.getEmail());
		
		
	}

}
