/*
문자열 입력 : 저장하려면 배열이 필요. 배열의 크기 알아야.

*/

#include <stdio.h>
#include <string.h>

int main_stringinput(void)
{
	char buffer[1024];	//몇 바이트인지 모르니 예상되는 크기보다 크게 설정.
	printf("문자열 입력 : ");
	scanf("%s", buffer);	// scanf &(주소) 처럼 char 배열의 주소는 그냥 배열 이름. 
	//scanf("%s", buffer) 는 단어 단위로 입력된다. 여러 단어 넣으면 하나밖에 안 나온다.
	printf("%s\n", buffer);
	printf("문자열의 크기 = %d\n", strlen(buffer));

	int ch = getchar();		// \n 엔터르르 강제로 읽어들이는 더미, getchar() 한 문자씩 읽어 들여 int ch에 입력시킴.

	printf("문자열 입력 : ");		// 문자열로 여러 단어, 즉 문장을 입력하려면
	gets(buffer);		// stdio.h 에서 정의된 라이브러리 함수. 문장을 입력하게 한다. scanf 대신 입력 기능.
	printf("%s\n", buffer);
	printf("문자열의 크기 = %d\n", strlen(buffer));

	int num;
	// sscanf(buffer, "%d", &num);			// 배열에서 입력받음.
	// fscanf(stdin, "%d", &num);			//파일에서 입력받음.

	fgets(buffer,1024, stdin);		// gets 랑 동일한데 파일에서 
	printf("%s\n", buffer);
	printf("문자열의 크기 = %d\n", strlen(buffer));
	printf("%d", ch);
	return 0;
}