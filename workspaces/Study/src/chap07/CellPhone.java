package chap07;

public class CellPhone {
	String model;
	String color;
	
	//������
	
	public CellPhone(){
		System.out.println("CellPhone() ������ ȣ���");
	}
	
	public CellPhone(String model, String color){
		System.out.println("CellPhone(String model, String color) ������ ȣ���");
		this.model = model;
		this.color = color;
	}
	
	public void powerOn(){
		System.out.println("������ �մϴ�.");
	}
	
	public void powerOff(){
		System.out.println("������ ���ϴ�");
	}
	
	public void sendMessage(String message){
		System.out.println(message + "�� �����մϴ�.");
	}

	public String receiveMessage(){
		System.out.println("�޽����� �����մϴ�.");
		return "���ŵ� ������";
	}
}
