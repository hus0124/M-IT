package chap07_Exercise;

public class Child extends Parent {
	private String name;
	
	public Child(){
		// �⺻������ super(); ���� parent ȣ���.
		this("ȫ�浿");	// parent ȣ�� �� ������ ����� ���ƿ��� �ٽ� 14���� this.name = name; ���� ���� �ȴ�.
		System.out.println("Child() call");
	}
	
	public Child(String name){
		
		this.name = name;
		System.out.println("Child(String name) call");	// �̰� ���� ȣ��ǰ� ���� �ٽ� this("ȫ�浿") �Ʒ��� ����.
	}

}
