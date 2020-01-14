package basic;

public class Morning {
	String color="¹«»ö";
	private int km = 0;
	private int valuePrice = 1000;
	
	Morning(){}
	
	Morning(String color){
		this.color = color;
	}
	
	Morning(String color, int valuePrice){
		this.color = color;
		this.valuePrice += valuePrice;
	}
	void showcolor() {
		System.out.println(color);
	}
	
	void run(int A) {
		km += A;
	}
	
	int showkm() {
		return km;
	}
	
	void use(int A) {
		valuePrice -= A;
	}
	
	void nowPrice() {
		System.out.println(valuePrice);
	}
}
