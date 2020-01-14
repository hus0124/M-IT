package prob21to30;

public class Test28 {
	double base = 5.0;
	double height = 3.5;
	
	double getArea() {
		double result = (base*height)/2;
		return result;
	}
	
	double getHypotenuse() {
		double result = Math.sqrt(base*base + height*height);
		return result;
	}
	
	double getPerimeter() {
		double result = base + height + getHypotenuse();
		return result;
	}
}
