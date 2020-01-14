package chap06_Excercise;
//exercise 19
public class Account {

	private int Balance = 0;
	private static final int MAX_BALANCE = 1000000;
	private static final int MIN_BALANCE = 0;
	
		
	public void setBalance(int num) {
		if(num <= MAX_BALANCE && num >= MIN_BALANCE){
			Balance += num;
			}
	}

	public int getBalance() {
		return Balance;
	}

	
	
	
}
