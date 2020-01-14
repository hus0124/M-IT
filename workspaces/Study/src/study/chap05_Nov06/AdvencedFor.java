package study.chap05_Nov06;

public class AdvencedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 6, 9, 12};
		int sum = 0;
		
		// 향상된 for 문은 배열과 컬렉션의 항목 요소를 순차 처리하므로 인덱스 없어도 됨. int i 초기식 조건식 증감식 없어도 됨.
		
		for(int num :arr)	// for(타입 변수 : 배열)
		{
			System.out.println(num);
			sum = sum + num;
		}
		
		System.out.println("합 = " + sum);

	}

}
