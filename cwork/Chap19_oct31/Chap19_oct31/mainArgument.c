/*
실행파일을 실행할 때 파라미터를 입력받는 방법

int main(int argc, char *argv[]) 
{ 
}
*/

#include <stdio.h>
#include <string.h>

int main_mainargu(int argc, char* argv[])		//argc 매개변수 (파라미터) 의 수
										//argv[] : 포인터 배열 -> 파라미터의 값(문자열 여러개)
{
	int i = 0;
	printf("전달된 문자열의 수: %d\n", argc);

	for (i = 0; i < argc; i++)
	{
		printf("%d번째 파라미터 : %s\n", i + 1, argv[i]);
	}

	int a = atoi(argv[1]);		//atoi : asc to integer 문자열로 들어온 걸 정수로 바꿔주는 함수.
	int b = atoi(argv[2]);

	printf("합: %d\n", a + b);

	return 0;
}