/*
전역변수와 지역변수

-전역변수(gloval) : 파일 내에서 어느 곳에서든 사용가능하다. 
                    때에 따라서 모든 파일(프로젝트 내에서) 에서 사용 가능
					고유의 주소가 존재한다.
					크기(양) 적당히 사용해야 한다. 너무 많이 사용하면 리소스 부담이 있다.
					파일의 앞에서 정의한다.(파일 앞쪽에 존재한다.)
					다른 (모든) 블록에서 호출 가능

-지역변수 (local) : 해당 지역(함수 내 중괄호 안쪽)블록 내에서만 사용되는 변수
                    stack 영역에 저장됨. 블록 벗어나면 사라진다.
					함수 종료되면 사라짐. 블록이 실행되는 기간에만 존재함. 다른 블록에서 호출할 수 없다. 

					
- static 변수 : 함수(파일)내에서 정의해서 사용. 해당 함수나 파일내에서 사용 가능.
                다른 함수나 파일에서는 호출 불가능
				변수의 값은 유지가 된다. heap 영역에 저장되고 프로그램 실행동안 계속 존재. 
				다음에 함수가 호출되면 이전에 저장되었던 값을 다시 사용할 수 있음.
				크기는 적당한 크기를 사용해야 함

- register 변수 : CPU 구조 상에 존재하는 레지스터 중에 하나를 사용한다.
                  빠른 프로그램 실행이 가능하다. 일반적으로는 사용하지 않는다.

- volatile 변수 : 휘발성

*/

#include <stdio.h>

void simpleFuncOne()
{
	int num = 20;				// 메인함수의 num 과 이름은 동일하지만 다른 함수 내의 변수들
	int num1 = 30;
	int num2 = 40;
	printf("num = %d\n", num);
}

int simpleFuncTwo(int num)   // 매개변수로 전달되는 int num 은 지역변수이다. 함수가 존재하는 기간에만 유효.
{                             // main 에 있는 int num = 10 이 복사되어 잠시 사용되다가 사라짐
	
	num = 30;
	return num;
}							

int main_localvariable(void)
{
	int num = 10;
	printf("num = %d\n", num);

	simpleFuncOne();
	printf("num = %d\n", num); // 위에서 정의된 num을 사용한다. 메인의 num이 아니다.

	num = simpleFuncTwo(num);			// simpleFuncTwo 함수 이름도 일종의 변수이며 주소가 있다. 값도 저장된다.
	printf("num = %d\n", num);
							// 변수 num은 main 과 simpleFuncone 함수에서 선언되고 사용되지만 이름만 같고 실제로 다른 변수
		
	return 0;



}