package chap06_Excercise;

// exercise 16

public class Printer {

	void println(int num){
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
