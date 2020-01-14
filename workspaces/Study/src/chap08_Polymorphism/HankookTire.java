package chap08_Polymorphism;

public class HankookTire implements Tire {

	// �ʵ� : Tire �������̽����� ���ǵ� -> �ٸ� Ŭ�������� �����ȴ�.
	
	String location;
	int maxRotation;
	int accmulatedRotation;
	
	// ������
	public HankookTire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// Tire �������̽��� �߻� �޼ҵ� ������
	// ���� ���� : ����, ����ȸ����, ��ũ ����, ���� ��ġ�� ��ȯ.
	@Override
	public boolean roll() {
		accmulatedRotation++;	// ������ ȸ��
		if(accmulatedRotation < maxRotation){
			System.out.println(location + " HankookTire ���� ����: " + (maxRotation - accmulatedRotation));
			return true;
		}
		else{
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
		
	}

}
