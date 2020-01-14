package basic;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pattern pattern = Pattern.compile("[a-zA-Z]");
		
		try {
			System.out.printf("알파벳입력 : ");
			String inputCha = scan.next(pattern);
			
			String upperCha = inputCha.toUpperCase();
			String lowerCha = inputCha.toLowerCase();
			
			if(inputCha.equals(upperCha))
				System.out.println("result : " + lowerCha);
			else 
				System.out.println("result : " + upperCha);
			
			scan.close();
			} 
		catch(InputMismatchException e) {
			System.out.println("입력메시지 에러\n" + e.toString());
			e.printStackTrace();
		} 
		finally {}
		
	}

}
