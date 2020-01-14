package chap06_Excercise;
//exercise 17
public class Printer_Singleton {

	private static Printer_Singleton instance = new Printer_Singleton();
	
	private Printer_Singleton(){}
	
	public static Printer_Singleton getInstance(){
		return instance;
	}
	
	void println(int num){		// 싱글톤 필요 없고 그냥 전부 public static void println 하면 된다.
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
