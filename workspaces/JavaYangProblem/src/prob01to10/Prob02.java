package prob01to10;

public class Prob02 {

	public static void main(String[] args) {
		int money = 65430;
		
		int tenthousand = money/10000;
		int thousand = (money%10000)/1000;
		int hundred = (money%1000)/100;
		int ten = (money%100)/10;

		System.out.printf("만원=%d\n", tenthousand);
		System.out.printf("천원=%d\n", thousand);
		System.out.printf("백원=%d\n", hundred);
		System.out.printf("십원=%d\n", ten);

	}
}
