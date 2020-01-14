package JavaTestReady;

public class Prob2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 8.0;
		String str2 = str1 + " Ư¡";
		System.out.println(str2);			// JDK8.0 Ư¡

		String str3 = "JDK" + 4 + 4.0;
		String str4 = 4 + 4.0 + "JDK";
		String str5 = "Tomcat" + (4 + 4.0);
		System.out.println(str3);			// JDK44.0

		System.out.println(str4);			// 8.0JDK

		System.out.println(str5);			// Tomcat8.0

	}

}
