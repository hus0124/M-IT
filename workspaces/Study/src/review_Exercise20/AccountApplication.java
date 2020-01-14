package review_Exercise20;

import java.util.Scanner;

public class AccountApplication {

	static final int MAX_ACCOUNT = 100;
	static Account accountArray[] = new Account[MAX_ACCOUNT];	// accoutnArray[n] = {ano, owner, balance}
	static Scanner scan = new Scanner(System.in);
	private static int count = 0;
	
	//static main �� �ۿ��� ���� �������ֱ�. �׷��� �������⼭ ���� ����.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean run = true;
	while(run){
		System.out.println("----------------------------------------------------------");
		System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
		System.out.println("----------------------------------------------------------");
		System.out.print("����> ");
		
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
			System.out.println("���α׷��� ����˴ϴ�.");
			run = false;
			break;
		default :
			System.out.println("��ȣ�� �ٽ� �����ϼ���");
			break;
		}
	}	
		
		
	}

	private static void createAccount() {
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scan.next();
		
		System.out.print("������: ");
		String owner = scan.next();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scan.nextInt();
		
		Account account = new Account(ano, owner, balance);
		accountArray[count] = account;
		count++;
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("--------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scan.next();
					
		System.out.print("�Աݾ�: ");
		int balance = scan.nextInt();
		
		Account account = findAccount(ano);
		if(account!=null){
		account.setBalance(account.getBalance() + balance);
		System.out.println("������ �����Ͽ����ϴ�.");
		System.out.print("�ܰ�: ");
		System.out.println(account.getBalance());}
		else {System.out.println("���¸��� �����ϼ���");}
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scan.next();
		
		System.out.print("��ݾ�: ");
		int balance = scan.nextInt();
		
		Account account = findAccount(ano);
		if(account==null)
		{System.out.println("���¸��� �����ϼ���");}
		else{
			if((account.getBalance()-balance)>=0){
		account.setBalance(account.getBalance() - balance);
		System.out.println("����� �����Ͽ����ϴ�.");
		System.out.print("�ܰ�: ");
		System.out.println(account.getBalance());}
			else
				System.out.println("�ܰ� �����մϴ�");}
	}	

	// �Ű����� ano. Account ��ü ��ȯ. �Ű������� ������ ���� �˻��ؼ� ��ȯ.
	public static Account findAccount(String ano){
		for(int i = 0; i < count; i++){
			if(accountArray[i].getAno().equals(ano)){
				return accountArray[i];
			}
		}
		return null;
	}
	
	
}
