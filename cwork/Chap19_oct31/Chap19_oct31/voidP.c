/*
void 포인터
void* 데이터 유형에 관계없이 어느 주소든지 저장만 가능하다. 
단점 : 데이터 유형을 모르므로 실질적으로 사용할 수 없음.
포인터 : 주소와 데이터 유형을 알아야 한다. 
그런데 어느 데이터 포인터인지 확인할 수 있으면 강제 형 변환

int sum = 100
int count = 2
double avg = (double) sum / count -> () 괄호 안에 데이터 형 써서 강제 형변환

void* vptr -> (int *) vptr ->강제 형변환으로 데이터 유형을 알 수 있게 된다. 이러면 조작이 가능하다. 


*/

#include <stdio.h>

int main_voidP(void)
{
	int num = 10;
	printf("num = %d\n", num);
	void* ptr = &num;
//	printf("num = %d\n", *ptr);
	printf("num = %d\n", *(int*)ptr);  // 강제 형변환 int 포인터로 바꿈. 
	
	return 0;
}