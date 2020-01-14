package chap08_Polymorphism;

public class NexenTire implements Tire {

	// �ʵ� : Tire �������̽����� ���ǵ� -> �ٸ� Ŭ�������� �����ȴ�.
	
	String location;
	int maxRotation;
	int accmulatedRotation;
	
	// ������
	public NexenTire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// Tire �������̽��� �߻� �޼ҵ� ������
	// ���� ���� : ����, ����ȸ����, ��ũ ����, ���� ��ġ�� ��ȯ.
	@Override
	public boolean roll() {
		accmulatedRotation++;	// ������ ȸ��
		if(accmulatedRotation < maxRotation){
			System.out.println(location + " NexenTire ���� ����: " + (maxRotation - accmulatedRotation));
			return true;
		}
		else{
			System.out.println("*** " + location + " NexenTire ��ũ ***");
			return false;
		}
		
	}

}
