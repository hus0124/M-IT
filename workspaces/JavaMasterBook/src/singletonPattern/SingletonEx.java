package singletonPattern;

public class SingletonEx {

	public static void main(String[] args) {
		SingleStudent shion1 = SingleStudent.getInstance();
		SingleStudent shion2 = SingleStudent.getInstance();
		
		if(shion1.equals(shion2)){
			System.out.println("�� ��ü�� ����");
		}
		else{
			System.out.println("�� ��ü�� �ٸ���");
		}

	}

}
