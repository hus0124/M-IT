package review_Exercise20;

public class Account {

	private String ano;
	private String owner;
	private int balance;
	
	// 생성자와 getter setter 모두 화면 우클릭 → source → generate 메뉴로 자동 생성 가능
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {return ano;}

	public void setAno(String ano) {
		this.ano = ano;}

	public String getOwner() {return owner;}

	public void setOwner(String owner) {this.owner = owner;}

	public int getBalance() {return balance;}

	public void setBalance(int balance) {	// 잔고 의미 balance 가 음수되지 않도록 한다.
		this.balance = balance;
	}
	
	
}

