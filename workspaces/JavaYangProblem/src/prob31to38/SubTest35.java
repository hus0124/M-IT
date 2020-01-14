package prob31to38;

public class SubTest35 extends Test35 {
	int y=0;
	int z=0;
	
	SubTest35(int x, int y){
		super(x);
		System.out.printf("%d %d 을 넘겨받은 생성자\n", x, y);
	}
	
	SubTest35(int x, int y, int z){
		this(x, y);
		System.out.printf("%d %d %d 을 넘겨받은 생성자\n", x,y,z);
		System.out.println("합 : " + (x+y+z));
	}
}
