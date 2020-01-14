package basic;

public class Add1 {
	int num1 = 0;
	int num2 = 0;
	
	Add1(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	Add1(){}
	
	int sum(){
		int result = num1 + num2;
		System.out.printf(num1 + "+" + num2 + "=");
		return result;
	}
	
	int sub(){
		int result = num1 - num2;
		System.out.printf(num1 + "-" + num2 + "=");
		return result;
	}
	
	void print() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}
