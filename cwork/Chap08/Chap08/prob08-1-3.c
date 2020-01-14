/*
문제 3. 학생의 전체 평균점수에 대한 학점을 출력하는 프로그램을
    작성하자. 학생의 성적이 90점 이상이면 A, 80점 이상이면 B,
    70점 이상이면 C, 50점 이상이면 D 그리고 그 미만이면 F다!
    프로그램 실행 시 순서대로 국어, 영어, 수학 점수를 입력 받
    는다. 그리고는 평균을 구한 다음 그에 적절한 학점을 출력하면
    된다.*/

#include <stdio.h>

int main_0813(void)
{
	int kor, eng, math;
	printf("국어점수를 입력하세요 : ");
	scanf("%d", &kor);
	printf("영어점수를 입력하세요 : ");
	scanf("%d", &eng);
	printf("수학점수를 입력하세요 : ");
	scanf("%d", &math);

	double avg = (kor + eng + math) / (double)3;

	if (avg >= 90)
	{
		printf("성적 : A");
	}
	else if (avg >= 80)
	{
		printf("성적 : B");
	}
	else if (avg >= 70)
	{
		printf("성적 : C");
	}
	else if (avg >= 50)
	{
		printf("성적 : D");
	}
	else
	{
		printf("성적 : F");
	}
	return 0;
}