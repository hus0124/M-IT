package org.zerock.domain;

import lombok.Data;

@Data
public class Criteria {

	private int pageNum;
	private int amount;
	
	public Criteria() { // 持失切
		this(1,10);
	}
	
	public Criteria(int pageNum, int amount) { //持失切
		this.pageNum = pageNum;
		this.amount = amount;
	}
}




