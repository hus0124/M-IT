package chap08_InterfaceReview;

import chap08_DefaultInherit.InterfaceDB;

public class MariaDB2 implements InterfaceDB{
	// �޼ҵ� 
	@Override
	public void insert(){
		System.out.println("MariaDB2:insert() ȣ���");
	}
	@Override
	public void select(){
		System.out.println("MariaDB2:select() ȣ���");
	}
	
}
