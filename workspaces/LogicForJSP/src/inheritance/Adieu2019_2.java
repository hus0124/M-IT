package inheritance;

public class Adieu2019_2 extends Adieu2019 {
	int dog = 3;
	Adieu2019_2(){
		super();
		System.out.println("Adiew2019_2 °´Ã¼ »ı¼º");
	}
	int sub(int a, int b) {
		super.num1 = a;
		super.num2 = b;
		return a-b;
	}
	
	@Override
	int sum(int a, int b) {
		return a*b;
	}
	
	
}
