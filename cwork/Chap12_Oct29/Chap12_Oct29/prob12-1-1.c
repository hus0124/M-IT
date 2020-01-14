/*
문제 12-1 [포인터의 이해]
문제 1 아래의 예제 실행 시 변수와 포인터 변수의 관계를 그려서
	설명해보자. 또한 출력의 결과도 예상해 보자.
	int main(void) {
	int num = 10;
	int * ptr1 = &num;
	int * ptr2 = ptr1;

	(*ptr1)++;
	(*ptr2)++;
	printf("%d\n", num);
	return 0;
	}
	*/

#include <stdio.h>

int main_prob1211(void) 
{
	int num = 10;
	int* ptr1 = &num;
	int* ptr2 = ptr1;

	printf("ptr1 = %p, *ptr1 = %d\n", ptr1, *ptr1);

	(*ptr1)++;		// 포인터 변수 ptr1이 가리키는 변수의 값이 증가
    (*ptr2)++;      // 괄호 없이 *ptr2++ 하면 아무것도 하지 않고 주소값만 증가됨.    
	
	printf("%d\n", num);
	printf("ptr1 = %p\tptr1 = %d\n", ptr1, *ptr1);		// %p : 주소출력 서식																		
	printf("ptr2 = %p\tptr2 = %d\n", ptr2, *ptr2);
	return 0;
}