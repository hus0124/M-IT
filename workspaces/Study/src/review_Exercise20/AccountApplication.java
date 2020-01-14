package review_Exercise20;

import java.util.Scanner;

public class AccountApplication {

	static final int MAX_ACCOUNT = 100;
	static Account accountArray[] = new Account[MAX_ACCOUNT];	// accoutnArray[n] = {ano, owner, balance}
	static Scanner scan = new Scanner(System.in);
	private static int count = 0;
	
	//static main 블럭 밖에서 먼저 정의해주기. 그래야 여기저기서 갖다 쓴다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean run = true;
	while(run){
		System.out.println("----------------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("----------------------------------------------------------");
		System.out.print("선택> ");
		
		int selecno = scan.nextInt();
		switch(selecno){
		case 1 :
			createAccount();
			break;
		case 2 :
			accountList();
			break;
		case 3 : 
			deposit();
			break;
		case 4 :
			withdraw();
			break;
		case 5 :
			System.out.println("프로그램이 종료됩니다.");
			run = false;
			break;
		default :
			System.out.println("번호를 다시 선택하세요");
			break;
		}
	}	
		
		
	}

	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scan.next();
		
		System.out.print("계좌주: ");
		String owner = scan.next();
		
		System.out.print("초기입금액: ");
		int balance = scan.nextInt();
		
		Account account = new Account(ano, owner, balance);
		accountArray[count] = account;
		count++;
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for(int i = 0; i < count; i++){
			System.out.print(accountArray[i].getAno());
			System.out.print("	");
			System.out.print(accountArray[i].getOwner());
			System.out.print("	");
			System.out.println(accountArray[i].getBalance());
		}
		
	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scan.next();
					
		System.out.print("입금액: ");
		int balance = scan.nextInt();
		
		Account account = findAccount(ano);
		if(account!=null){
		account.setBalance(account.getBalance() + balance);
		System.out.println("예금이 성공하였습니다.");
		System.out.print("잔고: ");
		System.out.println(account.getBalance());}
		else {System.out.println("계좌먼저 생성하세요");}
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String ano = scan.next();
		
		System.out.print("출금액: ");
		int balance = scan.nextInt();
		
		Account account = findAccount(ano);
		if(account==null)
		{System.out.println("계좌먼저 생성하세요");}
		else{
			if((account.getBalance()-balance)>=0){
		account.setBalance(account.getBalance() - balance);
		System.out.println("출금이 성공하였습니다.");
		System.out.print("잔고: ");
		System.out.println(account.getBalance());}
			else
				System.out.println("잔고가 부족합니다");}
	}	

	// 매개변수 ano. Account 객체 반환. 매개변수와 동일한 계좌 검색해서 반환.
	public static Account findAccount(String ano){
		for(int i = 0; i < count; i++){
			if(accountArray[i].getAno().equals(ano)){
				return accountArray[i];
			}
		}
		return null;
	}
	
	
}
