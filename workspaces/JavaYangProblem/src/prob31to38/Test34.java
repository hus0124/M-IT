package prob31to38;

public class Test34 extends Salary {
	String department;
	
	Test34(String n, int s, String d){
		super(n,s);
		department = d;
	}
	
	void getInformation2(){
		System.out.println("ºÎ¼­ : " + department);
	}
}
