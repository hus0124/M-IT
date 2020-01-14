package chap06_13Nov_Review;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone phone = new Phone("∞∂8", 30000);
		phone.powerOn();
		phone.sendMessage("æ»≥Á«œººø‰. π›∞©Ω¿¥œ¥Ÿ.");
		phone.hookOff();
		
		phone.hookOn();
		phone.receiveMessage();
		phone.powerOff();
		

	}

}
