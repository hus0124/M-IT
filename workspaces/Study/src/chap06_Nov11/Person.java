package chap06_Nov11;

public class Person {
	
	String name;
	String ssn;
	String birthday;
	
	double height = 10.0; 
	double weight = 2.5; 
	
	int head;
	int arm;
	int foot;
	
	Car mycar;
	
	/*public Person() {  이렇게 해 버리면 height 호출될 때 값이 10에서 20으로 바뀌어 호출된다.
		height = 20.0;
	}*/

}
