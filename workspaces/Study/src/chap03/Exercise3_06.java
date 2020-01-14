package chap03;

public class Exercise3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = (lengthTop + lengthBottom) * height / 2;				// 우변은 어쨌든 더블이니 소수점 포함해서 52.0 으로 나옴
		double area1 = (lengthTop + lengthBottom) * height / 2.0;
		double area2 = (double)(lengthTop + lengthBottom) * height / 2;
		double area3 = (lengthTop + lengthBottom) * (double)height / 2;
		double area4 = (double)((lengthTop + lengthBottom) * height / 2);	// 안 됨. 결과는 이미 52에서 더블로 해봐야 52.0 됨.
		
		System.out.println("사다리꼴의 넓이3 = " + area);		// 안됨
		System.out.println("사다리꼴의 넓이1 = " + area1);
		System.out.println("사다리꼴의 넓이2= " + area2);
		System.out.println("사다리꼴의 넓이3 = " + area3);
		System.out.println("사다리꼴의 넓이3 = " + area4);	// 안됨

	}

}
