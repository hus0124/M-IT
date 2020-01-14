package p300;

public class CallByValue {

	public static void main(String[] args) {
		int value = 1;
		callByValue(value);
		System.out.println("메인 : " + value);	// 1

	}

	public static void callByValue(int value){
		value++;
		System.out.println("서브sub : " + value); // 2
		
	}
}
