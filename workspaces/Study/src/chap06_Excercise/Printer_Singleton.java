package chap06_Excercise;
//exercise 17
public class Printer_Singleton {

	private static Printer_Singleton instance = new Printer_Singleton();
	
	private Printer_Singleton(){}
	
	public static Printer_Singleton getInstance(){
		return instance;
	}
	
	void println(int num){		// �̱��� �ʿ� ���� �׳� ���� public static void println �ϸ� �ȴ�.
		System.out.println(num);
	}
	
	void println(boolean result){
		if(result==true)
			System.out.println("true");
	}
	
	void println(double num){
		System.out.println(num);
	}
	
	void println(String str){
		System.out.println(str);
	}
}
