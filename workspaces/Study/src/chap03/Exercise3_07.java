package chap03;

public class Exercise3_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		
		System.out.println( (x > 7) && (y <= 5) );			// true
		System.out.println( (x % 3 == 2) || (y % 2 != 1) );	// false
		System.out.println( (x % 3 == 2) ^ (y % 2 != 1) );  // false 둘 다 false라서
		
		System.out.println( (x % 3 != 2) ^ (y % 2 == 1) );	//false 둘 다 트루인데 XOR 연산임.
		System.out.println( (x % 3 != 2) ^ (y % 2 != 1) );	//true 하나만 트루. 
	}

}
