/*
문제 2. char형 1차원 배열을 선언과 동시에 다음 문장의 내용으로
초기화하고, 초기화 이후에는 저당된 내용을 출력하는 예제를
작성해 보자.
"Good time"

[힌트]
scanf("%c")를 사용 : 반복문을 사용해서 한 글자씩 출력
% s : 단어 출력->문자열에 ' '에 있으므로 고민
puts()를 사용하면 해결이 되나, 문제에서는 사용하지 말고
문자열은 항상 정보 \0 하나 더 숨어 있다.
*/

#include <stdio.h>
// #include <string.h>

int main_prob11_2(void)
{
	char buffer[] = "\"Good time\"";		// 이렇게 비워두면 알아서 배열 크기가 잡힌다
	// buffer [i] != '\0' 

	for (int i = 0; ; i++)		// 조건을 i < sizeof(buffer) - 1 해도 된다. 
	{
		printf("%c", buffer[i]);
		if (buffer[i] == '\0')
			break;
	}
	printf("\nsize of array = %d\n", sizeof(buffer));

	// strlen : string length 문자열의 길이를 구하는 함수. #include <string.h> 문자열 조작 라이브러리 필요.

	for (int i = 0; i < strlen(buffer); i++)		 
	{
		printf("%c", buffer[i]);
		
	}
	return 0;
}
