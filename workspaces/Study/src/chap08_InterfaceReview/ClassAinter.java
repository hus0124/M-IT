package chap08_InterfaceReview;

import chap08_DefaultInherit.InterfaceDB;

public class ClassAinter {
	InterfaceDB idb;	// �������̽��� �ʵ�� ����
	
	public ClassAinter(InterfaceDB idb){	// �����ڸ� �������̽��� �����Ͽ� �������̽��� ������ �� ���� Ŭ������ �����ڷ� ���� �� �ְ� ó��.
		this.idb = idb;						
	}
	
	public void insert(){
		idb.insert();
	}
	
	public void select(){
		idb.select();
	}

}
