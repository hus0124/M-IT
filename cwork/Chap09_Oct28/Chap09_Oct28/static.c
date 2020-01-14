/*
static 변수 : ㅏㅁ수 또는 파일내에서 존재하는 변수
*/

#include <stdio.h>

static int total = 0;			// static 변수


int add(int num)
{
	printf("total = %d\n", total);	// 파일내에서는 접근 가능. 파일 밖에선 불가능.
	static int sum = 0;			//static 변수
								// 처음에 함수 add가 호출될때만 실행되고 그 다음에 호출될 때는 실행되지 않고 값은 유지됨
	printf("sum = %d\tnum = %d\n", sum, num);
	sum += num;
	return sum;
}

void sub()
{
	// int var3 = sum + 60;		// static 변수 sum은 add 함수에서만 접근이 가능하다. sub 함수에서는 접근 불가능.
}

int main_static(void)
{
	int i;
	int result;

	for (i = 1; i <= 10; i++)
	{
		result = add(i);
		sub();
	}
	printf("sum = %d\n", result);
	// print("sum = %d\n", sum);		// static 변수 sum은 add 함수에서만 접근 가능. 그래서 그 외에는 접근 불가. 
	
	return 0;
}