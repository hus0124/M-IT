package prob01to10;

public class Prob04 {

	public static void main(String[] args) {
		
		String name = "이효리";
		String department = "개발부";
		String position = "대리";
		int sal = 1500000;
		
		tenMinute(name, department, position, sal);

	}

	private static void tenMinute(String name, String department, String position, int sal) {
		System.out.println("이름 : " + name);
		System.out.printf("부서 : %s\n", department);
		System.out.printf("직위 : %s\n급여 : %d원", position, sal);
	}

}
