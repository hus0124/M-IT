package chap07_Exercise;

public class SnowTireExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		Tire tire1 = new Tire();	// tire1 �� �θ� Ÿ��
		tire1 = snowTire;			// �θ� Ÿ�� ��ü�� �ڽ� Ÿ�� snowTire�� ���� ����ȯ.
		
		snowTire.run();		// �ڽ� Ŭ���� SnowTire �� �θ� Ŭ���� Ÿ������ �ڵ�����ȯ. �ڽ� Ŭ������ run() ���� �۵��ȴ�.
		tire.run();
		tire1.run();	// ���� ����ȯ �Ͽ� �ڽ� Ŭ���� �޼ҵ尡 �۵�.
		
		if(tire1 instanceof SnowTire){
			System.out.println("��üŸ��Ȯ��");	// instanceof ���� �ڽ� Ÿ�� Ȯ��. ���� Ÿ�� ��ȯ �����ϴٴ� ���� Ȯ��.
		}
		
	}

}
