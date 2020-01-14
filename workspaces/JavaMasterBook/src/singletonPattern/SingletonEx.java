package singletonPattern;

public class SingletonEx {

	public static void main(String[] args) {
		SingleStudent shion1 = SingleStudent.getInstance();
		SingleStudent shion2 = SingleStudent.getInstance();
		
		if(shion1.equals(shion2)){
			System.out.println("두 객체는 같다");
		}
		else{
			System.out.println("두 객체는 다르다");
		}

	}

}
