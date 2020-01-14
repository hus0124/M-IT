package chap07;

public class DmbPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CellPhone cp = new CellPhone();	
		cp.powerOn();
		cp.sendMessage("안녕");
		String msg = cp.receiveMessage();
		cp.powerOff();
		
		DmbPhone dp = new DmbPhone("갤8", "white", 15);	//실행하면 cellphone이 먼저 호출된다.
		dp.dmb_powerOn();				//
		dp.sendMessage("부모의 메소드를 이용");
		String rxMsg = dp.receiveMessage();
		dp.changeChannel(11);
		dp.dmb_powerOff();
		dp.model = "노트10";
		dp.channel = 11;
	}

}
