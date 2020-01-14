package basic;

public class NumUtil {
	int count;
	static int count1;
	int maxnum(int a, int b){
		if(a>b)
			return a;
		else
			return b;
	}
	
	static boolean even(int a) {
		if(a%2==0)
			return true;	// Â¦¼ö
		else
			return false;	//È¦¼ö
	}
}
