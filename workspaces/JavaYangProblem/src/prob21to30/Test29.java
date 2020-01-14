package prob21to30;

public class Test29 {
	
	static final double PI = 3.141593;
	
	double area(int a) {
		double result = a*a*PI;
		return result;
	}
	
	double area(int a, int b) {
		double result = a*b;
		return result;
	}
	
	double area(int a, int b, int c) {
		double result = ((a+b)*c)/2;
		return result;
	}
}
