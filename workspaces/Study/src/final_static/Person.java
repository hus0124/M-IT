package final_static;

public class Person {
	final String nation = "korea";	//파이널로 고정.
	final String ssn;
	String name;
	
	public Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}

}
