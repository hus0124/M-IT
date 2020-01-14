package inheritance;

public class Adieu2019 {
	int num1;
	int num2;
	
	Adieu2019(int a, int b){
		this.num1 = a;
		this.num2 = b;
	}
	
	Adieu2019(){
		System.out.println("Adieu2019 클래스 객체를 입력값 없이 생성");
	}
	
	int sum(int num1, int num2) {
		return num1+num2;
	}
	
	int sum1() {
		return num1+num2;
	}
}
