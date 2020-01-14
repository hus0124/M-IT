package access_modifier;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();			// O
		Car car2 = new Car("현대");		// O
		Car car3 = new Car(10.5);		// O
		// Car car4 = new Car(10, "기아");	// X
		car.field1 = 20;
		car.field2 = 20;
		car.field3 = 20;
		// car.field4 = 20;
		
		car.method1();
		car.method2();
		car.method3();
		// car.method4();
		
	}

}
