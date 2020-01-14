package chap07_abstract_15Nov;

public class SmartPhone extends Phone {

	public SmartPhone(String owner){
		super(owner);	// �θ� Ŭ���� Phone �� ���� ������ ȣ��.
	}
	
	public void internetSearch(String url){
		System.out.println(url + "�� �˻��մϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("����Ʈ���� �մϴ�.");
	}

	

	
	
	// ��� ���� �ڽ��� �θ� Ŭ������ �߻� �޼��尡 �ִٸ� �ݵ�� ������ ���־�� �Ѵ�. 
	 @Override
	public void sendMessage(String message){}
	
	//�θ� Ŭ������ �߻� �޼��带 �ڽ� Ŭ������ ������ �ؾ� ������ ������ �� �ϰ� �ڽ� Ŭ������ �ٽ� �߻� �޼���, �߻� Ŭ������ ���� ���� �ִ�. 
	// public abstract class SmartPhone extends Phone { ���� �κ��� �̷��� ���ϸ� �ȴ�.
	// �׸��� �Ʒ��κ� �߻� �޼��带 �����Ѵ�. public abstract void sendMessage(String message);
	 // �̷��� �Ǹ� �߻� Ŭ������ new �����ڷ� ��ü ���� ���ϰ� �ȴ�.
}
