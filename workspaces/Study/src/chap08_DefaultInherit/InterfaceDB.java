package chap08_DefaultInherit;

public interface InterfaceDB {
	void insert();
	void select();
	
	default void update()		// �������̽��� ����Ʈ �޼ҵ带 �̿��ϸ� �ٸ� �� ���� ������ �ʿ䰡 ����. �����ϴ� ������ �����Ǹ� ���ָ� ��.
	{
		System.out.println("up");
	}
}
