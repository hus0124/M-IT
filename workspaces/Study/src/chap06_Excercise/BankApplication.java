package chap06_Excercise;
//exercise 20
import java.util.Scanner;

public class BankApplication {
	private static BankAccount[] accountArray = new BankAccount[100];
	private static int count = 0;	// 계좌 개설 고객수
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		if(count == 100){
			System.out.println("계좌 생성 한도 초과");
			return;
		}
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		BankAccount newAccount = new BankAccount(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++){
			if(accountArray[i]==null){
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다");
				count++;
				break;
			}
		}	
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
	
		for(int i = 0; i < count; i++){
			BankAccount account = accountArray[i];
			System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		
		// findAccount() 라는 메소드 필요. 저장된 계좌 잔고 찾는다.
		BankAccount account = findAccount(ano);
		if(findAccount(ano)!=null){ //계좌검색성공
			account.setBalance(account.getBalance()+balance);
		}
		else{System.out.println("계좌 먼저 생성하세요");}
		System.out.println("잔고 : " + account.getBalance());
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		
		// findAccount() 라는 메소드 필요. 저장된 계좌 잔고 찾는다.
		BankAccount account = findAccount(ano);
		if(findAccount(ano)!=null){ //계좌검색성공
			account.setBalance(account.getBalance()-balance);
		}
		else{System.out.println("계좌 먼저 생성하세요");}
		System.out.println("잔고 : " + account.getBalance());
	}	
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static BankAccount findAccount(String ano) {
		//accountArray 배열에서 찾는다.
		for (int i = 0; i < count; i++){
			BankAccount account = accountArray[i];
			if(account.getAno().equals(ano)){
				return account;
			}
		}
		return null;	//계좌 못 찾을 경우.
	}
}
















