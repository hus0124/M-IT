package chap08_InterfaceReview;

import chap08_DefaultInherit.InterfaceDB;

public class OracleDB2 implements InterfaceDB{
	// ∏ﬁº“µÂ 
	@Override
	public void insert(){
		System.out.println("OracleDB2:insert() »£√‚µ ");
	}
	@Override
	public void select(){
		System.out.println("OracleDB2:select() »£√‚µ ");
	}
	
}
