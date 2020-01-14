package JavaTestReady;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
