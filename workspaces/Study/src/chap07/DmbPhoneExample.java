package chap07;

public class DmbPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CellPhone cp = new CellPhone();	
		cp.powerOn();
		cp.sendMessage("�ȳ�");
		String msg = cp.receiveMessage();
		cp.powerOff();
		
		DmbPhone dp = new DmbPhone("��8", "white", 15);	//�����ϸ� cellphone�� ���� ȣ��ȴ�.
		dp.dmb_powerOn();				//
		dp.sendMessage("�θ��� �޼ҵ带 �̿�");
		String rxMsg = dp.receiveMessage();
		dp.changeChannel(11);
		dp.dmb_powerOff();
		dp.model = "��Ʈ10";
		dp.channel = 11;
	}

}
