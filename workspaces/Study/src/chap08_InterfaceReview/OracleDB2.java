package chap08_InterfaceReview;

import chap08_DefaultInherit.InterfaceDB;

public class OracleDB2 implements InterfaceDB{
	// �޼ҵ� 
	@Override
	public void insert(){
		System.out.println("OracleDB2:insert() ȣ���");
	}
	@Override
	public void select(){
		System.out.println("OracleDB2:select() ȣ���");
	}
	
}
