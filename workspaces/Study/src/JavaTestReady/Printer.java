package JavaTestReady;
/*
 * PrinterExample Ŭ�������� Printer ��ü�� �����ϰ� println() �޼ҵ带 ȣ���ؼ� �Ű����� �ֿܼ� ����Ϸ��� �մϴ�. 
 * println() �޼ҵ��� �Ű������δ� int, boolean, double, String ���� �� �� �ֽ��ϴ�. 
 * PrinterŬ�������� println() �޼ҵ带 ������ ������.
 */
public class Printer {
	
		int num;
		String name;
		double dnum;
		boolean tt;
		
		void println(int num){
			System.out.println(num);
		}
		void println(double dnum){
			System.out.println(dnum);
		}
		void println(String name){
			System.out.println(name);
		}
		void println(boolean tt){
			System.out.println(tt);
		}
		
	public static void main(String[] args) {
		Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.8);
        printer.println("ȫ�浿");
	}

}
