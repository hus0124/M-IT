package prob01to10;

public class Prob03 {

	public static void main(String[] args) {
		int basic = 1500000;
		int workpay = 55000;
		double tax = basic*0.1;
		
		double real = basic + workpay - tax;
		
		System.out.printf("�Ǽ��ɾ� : %.0f��", real);

	}

}
