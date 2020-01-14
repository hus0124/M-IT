package chap06_Excercise;
//exercise 20
import java.util.Scanner;

public class BankApplication {
	private static BankAccount[] accountArray = new BankAccount[100];
	private static int count = 0;	// ���� ���� ����
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	
	//���»����ϱ�
	private static void createAccount() {
		if(count == 100){
			System.out.println("���� ���� �ѵ� �ʰ�");
			return;
		}
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		BankAccount newAccount = new BankAccount(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++){
			if(accountArray[i]==null){
				accountArray[i] = newAccount;
				System.out.println("���: ���°� �����Ǿ����ϴ�");
				count++;
				break;
			}
		}	
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("---------");
		System.out.println("���¸��");
		System.out.println("---------");
	
		for(int i = 0; i < count; i++){
			BankAccount account = accountArray[i];
			System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
		}
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("---------");
		System.out.println("����");
		System.out.println("---------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();
		
		// findAccount() ��� �޼ҵ� �ʿ�. ����� ���� �ܰ� ã�´�.
		BankAccount account = findAccount(ano);
		if(findAccount(ano)!=null){ //���°˻�����
			account.setBalance(account.getBalance()+balance);
		}
		else{System.out.println("���� ���� �����ϼ���");}
		System.out.println("�ܰ� : " + account.getBalance());
	}
	
	//����ϱ�
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();
		
		// findAccount() ��� �޼ҵ� �ʿ�. ����� ���� �ܰ� ã�´�.
		BankAccount account = findAccount(ano);
		if(findAccount(ano)!=null){ //���°˻�����
			account.setBalance(account.getBalance()-balance);
		}
		else{System.out.println("���� ���� �����ϼ���");}
		System.out.println("�ܰ� : " + account.getBalance());
	}	
	
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static BankAccount findAccount(String ano) {
		//accountArray �迭���� ã�´�.
		for (int i = 0; i < count; i++){
			BankAccount account = accountArray[i];
			if(account.getAno().equals(ano)){
				return account;
			}
		}
		return null;	//���� �� ã�� ���.
	}
}
















