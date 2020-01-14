package chap08_InterfaceReview;

import chap08_DefaultInherit.InterfaceDB;

public class ClassAinter {
	InterfaceDB idb;	// 인터페이스를 필드로 지정
	
	public ClassAinter(InterfaceDB idb){	// 생성자를 인터페이스로 지정하여 인터페이스를 구현한 두 개의 클래스를 생성자로 받을 수 있게 처리.
		this.idb = idb;						
	}
	
	public void insert(){
		idb.insert();
	}
	
	public void select(){
		idb.select();
	}

}
