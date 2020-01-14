package prob31to38;

public class Test38 extends Health {
	double s_weight;
	double fat;
	String result;
	
	Test38(){
		
		this.s_weight = 0.0;
		this.fat = 0.0;
		this.result = "";
	}
	
	void calculate() {
		if(gender=='M')
			s_weight = (tall-100)*0.9;
		else
			s_weight = (tall-100)*0.85;
		
		fat = (weight/s_weight)*100;
		
		if(fat > 150)
			result = "고도비만";
		else if(fat > 130)
			result = "중도비만";
		else if(fat > 120)
			result = "경도비만";
		else if(fat > 110)
			result = "과체중";
		else if(fat > 90)
			result = "정상(표준체중)";
		else
			result = "저체중";
	}
	
	void output2() {
		System.out.printf("\n당신은 비만도 %.2f이고, %s 입니다.", fat, result);
	}
}
