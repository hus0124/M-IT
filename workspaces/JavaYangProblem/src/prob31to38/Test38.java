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
			result = "����";
		else if(fat > 130)
			result = "�ߵ���";
		else if(fat > 120)
			result = "�浵��";
		else if(fat > 110)
			result = "��ü��";
		else if(fat > 90)
			result = "����(ǥ��ü��)";
		else
			result = "��ü��";
	}
	
	void output2() {
		System.out.printf("\n����� �񸸵� %.2f�̰�, %s �Դϴ�.", fat, result);
	}
}
