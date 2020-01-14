package method;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		Printer myPrinter = new Printer();
		
		int a = 10;
		int b = 20;
		int sum = cal.add(a, b);
		System.out.println("гу: " + sum);
		
		double d1 = 20.0;
		double d2 = 30.0;
		System.out.println("гу: " + cal.add(d1, d2));
		System.out.println();
		
		myPrinter.println(3.14);
		myPrinter.println(30);
		myPrinter.println("Hello World!");
	
	}

}
