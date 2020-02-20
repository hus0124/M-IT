
public class Hello {

	public static void main(String[] args) throws Exception {
		
		TestEx1 testex1 = new TestEx1();
		int num = testex1.exec();
		System.out.println(num);
		
		TestEx2 testex2 = new TestEx2();
		testex2.exec();
	}

}
