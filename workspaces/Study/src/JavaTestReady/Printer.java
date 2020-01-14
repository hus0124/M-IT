package JavaTestReady;
/*
 * PrinterExample 클래스에서 Printer 객체를 생성하고 println() 메소드를 호출해서 매개값을 콘솔에 출력하려고 합니다. 
 * println() 메소드의 매개값으로는 int, boolean, double, String 값을 줄 수 있습니다. 
 * Printer클래스에서 println() 메소드를 선언해 보세요.
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
        printer.println("홍길동");
	}

}
