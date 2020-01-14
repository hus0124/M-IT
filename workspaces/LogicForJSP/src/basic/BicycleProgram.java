package basic;

public class BicycleProgram {

	public static void main(String[] args) {
		
		Bicycle bc1 = new Bicycle(50,10,2);
		Bicycle bc2 = new Bicycle(50,10,2);
		
		bc1.printStates();
		
		bc2.changecadence(40);
		bc2.speedUp(10);
		bc2.changeGear(3);
		
		bc2.printStates();
	}

}
