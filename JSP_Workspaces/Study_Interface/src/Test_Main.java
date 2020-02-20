
public class Test_Main {

	public static void main(String[] args) {
		
		AClass aclass = new AClass();
		aclass.exec();

		BClass bclass = new BClass();
		CClass cclass = new CClass();
		
		aclass.exec2(bclass);
		aclass.exec2(cclass);
	}

}
