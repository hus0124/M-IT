package chap07_field_15Nov;

public class KumHoTire2 extends Tire {
	// ����Ʈ �����ڰ� �ʿ��ϴ�. �θ��� �����ڸ� ȣ��.
	public KumHoTire2(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation){
			System.out.println(location + "KumHoTire ���� :" + (maxRotation-accumulatedRotation));
		return true;
		}
		else{
			System.out.println(location + "KumHoTire ��ũ ***");
			return false;
		}
	}

}
