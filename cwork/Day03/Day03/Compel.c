#include <stdio.h>

int main_compel(void)
{
	int math = 91;
	int eng = 100;
	int sum = math + eng;
	double avg = sum / 2;			// 정수 나누기 정수라서 이미 소수점 없음. 더블로 넣어도 소수점 이미 없음.
									// 평균 낼 때 적어도 어느 한 쪽이 더블이어야 한다. 이건 자동형변환 된다. int -> double
									// 아니면 강제 형변환 필요

	printf("과목 평균 = %f\n", avg);

	double avg2 = (double)sum / 2;	// sum을 더블로 강제 형변환
	printf("avg2 = %f\n", avg2);
	return 0;
}