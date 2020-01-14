package chap11_Api;

public class Stringapi {

	public static void main(java.lang.String[] args) {
		String str = "I have a dream";
		//charAt : 한문자씩 접근 방법 제공(index 위치)
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str.charAt(i));
		}

		int position = str.indexOf("have");
		{System.out.println("have의 위치 = " + position);}
	

	if(str.startsWith("I")){
		System.out.println("이 문자열은 I로 시작열임");}
	else {System.out.println("이 문자열은 I로 시작하는 문자열이 아님");
	}
	
	if(str.contains("has")) {
		System.out.println("포함");
	}
	else {System.out.println("비포함");}
	
	System.out.println(str.hashCode());
	String str2 = str.replace("have", "has");
	System.out.println(str2.hashCode());
	
}
}