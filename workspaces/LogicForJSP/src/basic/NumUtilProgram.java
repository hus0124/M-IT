package basic;

public class NumUtilProgram {

	public static void main(String[] args) {
		
		NumUtil numutil = new NumUtil();
		numutil.count = 3;
		System.out.println(numutil.count);
		
		NumUtil numutil2 = new NumUtil();
		numutil2.count = 4;
		System.out.println(numutil2.count);
		System.out.println(numutil.count);
		
		NumUtil.count1 = 2;
		System.out.println(NumUtil.count1);
		System.out.println(numutil.maxnum(9,8));
		System.out.println(numutil.maxnum(5,5));
		System.out.println(numutil.maxnum(1,10));
		
		if(NumUtil.even(7))
			System.out.println("Â¦¼ö");
		else
			System.out.println("È¦¼ö");
		
		
	}

}
