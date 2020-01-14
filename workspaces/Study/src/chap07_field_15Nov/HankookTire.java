package chap07_field_15Nov;

public class HankookTire extends Tire {
	// ����Ʈ �����ڰ� �ʿ��ϴ�. �θ��� �����ڸ� ȣ��.
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation){
			System.out.println(location + "HankookTire ���� :" + (maxRotation-accumulatedRotation));
		return true;
		}
		else{
			System.out.println(location + "HankookTire ��ũ ***");
			return false;
		}
	}

}
