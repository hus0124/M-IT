package prob01to10;

public class Prob04 {

	public static void main(String[] args) {
		
		String name = "��ȿ��";
		String department = "���ߺ�";
		String position = "�븮";
		int sal = 1500000;
		
		tenMinute(name, department, position, sal);

	}

	private static void tenMinute(String name, String department, String position, int sal) {
		System.out.println("�̸� : " + name);
		System.out.printf("�μ� : %s\n", department);
		System.out.printf("���� : %s\n�޿� : %d��", position, sal);
	}

}
