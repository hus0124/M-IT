package chap08_Polymorphism;

public class Car {
	Tire fl = new HankookTire("��������", 5);
	Tire fr = new HankookTire("�������", 3);
	Tire bl = new NexenTire("�ĸ�����", 4);
	Tire br = new NexenTire("�ĸ����", 6);
	
	// ���� �޼ҵ�
	// Ÿ�̾� ȸ���ϸ鼭 ���� : ����, ��ũ ���� �˷���
	public int run(){
		System.out.println("�������");
		if(!fl.roll()){	// ��ũ �߻��ϸ�
			System.out.println("�տ��� ���� ��ũ");
			stop();
			return 1;	// ���峭 ��ġ
		}
		if(!fr.roll()){	// ��ũ �߻��ϸ�
			System.out.println("�տ����� ���� ��ũ");
			stop();
			return 2;	// ���峭 ��ġ
		}
		if(!bl.roll()){	// ��ũ �߻��ϸ�
			System.out.println("�ڿ��� ���� ��ũ");
			stop();
			return 3;	// ���峭 ��ġ
		}
		if(!br.roll()){	// ��ũ �߻��ϸ�
			System.out.println("�ڿ����� ���� ��ũ");
			stop();
			return 4;	// ���峭 ��ġ
		}
		return 0;
	}
	
	
	public void stop(){
		System.out.println("��������");
	}
}
