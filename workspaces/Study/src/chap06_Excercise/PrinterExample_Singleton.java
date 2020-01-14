package chap06_Excercise;
//exercise 17
public class PrinterExample_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Printer_Singleton printer = Printer_Singleton.getInstance();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");


	}

}
