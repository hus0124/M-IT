package JavaTestReady;
/* ���� 2-7
 * ���� ������ ȸ���� Member Ŭ������ �𵨸��Ϸ��� �մϴ�. 
 * ȸ���� �����ͷδ� �̸�, ���̵�, �н�����, ���̰� �ֽ��ϴ�. 
 * �� �����͸� ������ Member Ŭ������ �����ϰ�, ������ ���� Member ��ü�� ������ �� 
 * name �ʵ�� id �ʵ带 �ܺο��� ���� ������ �ʱ�ȭ�Ϸ��� �����ڸ� ��� �����ؾ� �մϱ�?
 * �̸� name ���ڿ�
 * ���̵� id ���ڿ�
 * �н����� password ���ڿ�
 * ���� age ����
 * 
 * ��ü
 * Member user1 = new Member(��ȫ�浿��, ��hong��);
 * Member user2 = new Member(�����ڹ١�, ��kang��);
 */
public class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
}
