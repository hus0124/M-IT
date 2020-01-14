/*
문제 22-1 [구조체의 정의]

문자열 형태의 "종업원 이름"과 문자열 형태의 "주민등록번호" 그리고 정수 형태의 "급여정보"를 저장하는
employee라는 이름의 구조체를 정의해보자. 그리고나서 employee 구조체 변수를 하나 선언한 다음,
프로그램 사용자가 입력하는 정보로 이 변수를 채우자. 그리고 마지막으로 구조체 변수에 채워진 데이터를 출력해 보자.

문제 22-2 [구조체 배열의 선언]
앞서 문제 22-1에서 정의한 employee 구조체를 기반으로 길이가 3인 배열을 선언하자. 
그리고 세 명의 정보를 프로그램 사용자로부터 입력 받아서 배열에 저장한 다음, 
배열에 저장한 데이터를 순서대로 출력하는 예제를 작성해 보자.

*/

#include <stdio.h>
#include "define.h" // 헤더파일로 정의한 걸 서두에 불러온다.

#define MAX 3	// 상수 정의. preprocessor 

/* 이 내용을 헤더파일로 불러온다.

struct employee
{
	char name[10];
	char ssn[15];
	int pay;
};

*/

int main_prob222(void)
{
	struct employee arr[MAX];
	
	for (int i = 0; i < MAX; i++)
	{
		printf("종업원 이름 : ");
		scanf("%s", arr[i].name);
		
		printf("주민번호 : ");
		scanf("%s", arr[i].ssn);	// 문자형 arr 주소 & 필요없음
		
		printf("급여정보 : ");
		scanf("%d", &arr[i].pay);	// int형 arr 주소 & 필요
		printf("\n");
	}

	printf("\n\n");

	for (int i = 0; i < MAX; i++)
	{
		printf("이름 : %s\n", arr[i].name);
		printf("주민번호 : %s\n", arr[i].ssn);
		printf("급여 : %d\n", arr[i].pay);
		printf("\n");
	}
	return 0;
}