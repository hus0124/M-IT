package p300;

public class CallByValue {

	public static void main(String[] args) {
		int value = 1;
		callByValue(value);
		System.out.println("���� : " + value);	// 1

	}

	public static void callByValue(int value){
		value++;
		System.out.println("����sub : " + value); // 2
		
	}
}
