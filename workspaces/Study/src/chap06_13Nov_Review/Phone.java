package chap06_13Nov_Review;

public class Phone {
	//Ŭ������ ���� ����� �ʵ�(����, ����, ��ǰ, ���), ������, �޼ҵ�
	
	public static final int BUSY = 1;		// static ����, final �Һ� ����.
	public static final int IDLE = 2;		// �����̴� -> �޼ҵ� ������ Ŭ������ �����Ѵ�.
	public static final int RING = 3;		// static -> Ŭ���� �̸����� �����Ѵ�. Phone.BUSY, Phone.RING
	
	int state = IDLE;	
	int power;
	String model;
	int dataUsage;
	int monthlyFee;
	// �� �����ڰ� ��ü�� �����ϱ� ���� �ʵ� �ʱ�ȭ
	
	// ������ : ��ü�� �����ϰ� �ʱ�ȭ �� ����. heap ���� �޸� �Ҵ� ���� �� �ν��Ͻ�ȭ
	// �������� ������ ClassName(){} �̰� �⺻ �ۼ�.
	
	// HandPhone(){} default �⺻������. �ٸ� ������ ������ �����Ϸ��� �̷� ������ �⺻ ������ �ִٰ� ������. �� �⺻ �����ڴ� ���� �� �ᵵ ��.
	// ��ü �����ϸ鼭 �ʱⰪ ���� �ʿ��ϸ� ���ο� ������ �����Ѵ�.
	
	Phone(String model, int fee){
		this.model = model;
		monthlyFee = fee;
	}
	
	Phone(int power, String model){		// ������ �����ε�. ������ �̸��� ������ �Ű����� Ÿ��, ����, ������ �޶� �پ��� �����ڷ� ���ֵ�.
		
	}

	// ȭ�� ��Ŭ�� �� source �� Generate Constructor using Fields �� ���ϴ� �ʵ� �����ؼ� ������ ���� ����.
	
	public Phone(String model, int dataUsage, int monthlyFee) {
		//this(model, dataUsage, monthlyFee); this( ) �� �ȿ� �ִ� ����� ������ ���� �̿ܿ� �� �ְ� ���� �� ����ϴ� ��.
		super();	// �θ� Ŭ���� �� �ǹ�. ��� Ŭ������ �θ� Object class. �̰� ������ ������ ��.
		
		this.model = model;
		this.dataUsage = dataUsage;
		this.monthlyFee = monthlyFee;
		power = 0;
		state = IDLE;
	}

	public void powerOn(){
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff(){
		System.out.println("������ ���ϴ�");
	}
	
	void sendMessage(String message){
		dataUsage += message.length();
		System.out.println(message + "�� �����մϴ�.");
	}

	String receiveMessage(){
		String buffer ="���� �޽��� ���� ����";
		dataUsage += buffer.length();
		power -= 1;
		return buffer;
	}
	
	void chargeBattery(int hour){
		System.out.println("�����մϴ�.(" + hour + ")");
		power += (hour * 2);
	}
	
	void hookOff(){
		System.out.println("��ȭ�� �����ϴ�");
	}
	
	void hookOn(){
		System.out.println("��ȭ�� �����մϴ�");
	}
}
