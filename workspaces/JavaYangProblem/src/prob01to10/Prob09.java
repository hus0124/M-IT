package prob01to10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Pattern pattern = Pattern.compile("[a-zA-Z]");
		
		System.out.printf("Input Character : ");
		String inputCha = scan.next();
		scan.close();
		
		Matcher matcher = pattern.matcher(inputCha);
		
		if(!matcher.find())
			System.out.println("입력데이터 오류");
		else {
		String upperCha = inputCha.toUpperCase();
		String lowerCha = inputCha.toLowerCase();
		
		if(inputCha.equals(upperCha))
			System.out.println("result : " + lowerCha);
		else 
			System.out.println("result : " + upperCha);

		}
	}

}
