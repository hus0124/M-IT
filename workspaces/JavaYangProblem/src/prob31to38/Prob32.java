package prob31to38;

public class Prob32 {
	
	Prob32(int a, int b){
		if(a > b) 
			System.out.println("max = " + a);
		else
			System.out.println("max = " + b);
		
	}
	
	Prob32(double a, double b){
		if(a > b) 
			System.out.println("max = " + a);
		else
			System.out.println("max = " + b);
	}
	
	Prob32(char a, char b){
		if(a > b) 
			System.out.println("max = " + a);
		else
			System.out.println("max = " + b);
	}
	public static void main(String[] args) {
		
		Prob32 ob1 = new Prob32(10,20);
		Prob32 ob2 = new Prob32(12.4, 9.45);
		Prob32 ob3 = new Prob32('Z', 'p');
		
	}

}
