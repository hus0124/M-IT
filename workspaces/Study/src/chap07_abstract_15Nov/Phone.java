package chap07_abstract_15Nov;
// �߻� Ŭ���� : ǥ��ȭ�� Ŭ���� ���� (�������� Ŭ������ ���� Ư���� ����)
/*
 * Phone : galaxy note tablet 
 * ���� : �ε�(����) �߱�(���� ����) �ѱ�(���ο�)
 * ǥ��ȭ�� Ŭ������ ������ �� (�߻� Ŭ����)
 * �𵨺��� �� ���󺰷� ��ü Ŭ������ ���� �����ϸ� ������ ȿ��ȭ
 * abstract Ű���带 ���
 * new �����ڷ� ��ü�� ������ �� ����. �߻� Ŭ������ ����� �ڽ� Ŭ������ ���� ����.  
 */
public abstract class Phone {

	private String owner;

	public Phone(String owner){
		this.owner = owner;
	}
	
	public void turnOn(){
		System.out.println("�� ������ �մϴ�");
		
	}
	
	public void turnOff(){
		System.out.println("�� ������ ���ϴ�");
	}
		
		public abstract void sendMessage(String message);		//�߻�޼���. ��ӹ��� �ڽ��� �ݵ�� ��ü ���� �ؾ� �Ѵ�.
			
		
	}
	
	

