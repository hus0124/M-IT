/*
함수 : function

반환형 함수이름(매개변수) {	// '{' 함수의 시작
	실행문;
	return value;	// 반환형이 존재하면 사용하고
					// 반환형이 void면 사용 안함
} // '}' 함수의 끝

반환형 : 일반적인 데이터 타입 (int, char, short, long, float,...)
함수이름 : 영문 소문자로 시작, 단어의 조합일 경우 두번째 단어부터는
	대문자로, 중복되면 안됨
매개변수 : 필요에 따라 0~개 존재 가능
	데이터타입 변수이름, 데이터타입 변수이름, ...
return : 반환형이 존재할 경우 필수 (반환형의 데이터타입과 같은 유형을 반환)
두 개의 수를 더하는 프로그램
*/

#include	<stdio.h>

// 함수의 위치 : 방법 1 호출하는 위치보다 함수의 정의부분이 앞에 있음
void showHelp(void) {	// 반환형 없음, 매개변수 없음
	printf("두 개의 정수 입력 : ");
}

// 방법 2에서 해야할 일 : 함수에 대한 원형을 선언
int getNumber();	// 실행부가 없고 선언만 (반환형, 매개변수, 함수이름)

int add(int num1, int num2) {	// 매개변수와 반환형이 있는 경우
	return num1 + num2;
}

void printResult(int, int, int);	// 매개변수 이름은 생략 가능

int main_function(void) {
	int num1, num2;
	// printf("두 개의 정수 입력 : ");
	showHelp();	// 도움말을 출력하는 함수

	// scanf("%d %d", &num1, &num2);
	num1 = getNumber();	// 정수 한 개를 읽어 온다.
	num2 = getNumber();	// 같은 기능을 함수로 호출 -> 코드의 중복을 피함
	// 기능별로 모듈화 (큰 프로그램)

	// int sum = num1 + num2;
	int sum = add(num1, num2);

	// printf("%d + %d = %d\n", num1, num2, sum);
	printResult(num1, num2, sum);
	return 0;
}

void printResult(int a, int b, int c) {
	printf("%d + %d = %d\n", a, b, c);
}

/*
// 방법 2
void showHelp() {

}
*/

// 방법 2 : 호출하는 위치(31 줄)보다 뒤(46 줄)에 함수를 정의
int getNumber() {
	int num;
	scanf("%d", &num);
	return num;	// 나를 호출한 곳으로 값을 반환
}
