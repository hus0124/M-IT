
public class Test3Quiz {
	int sum = 0;
	
	public int calc(int a, int b) {
		
		int tmp = 0;
		
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i = a; i <= b; i++) {
			if(i % 2 != 0) {
				sum+=i;
			}
		}
		return sum;
	}

}
