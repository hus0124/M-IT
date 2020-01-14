#include <stdio.h>

int main_variableName(void)
{
	int var1;		// 변수는 숫자로 시작할 수 없다. 
	int _var2;		// 변수는 '_' 로 시작 가능은 하다 : 시스템에서 사용하므로 사용자는 안 쓰는게 좋다.
					// 프로그램이 실행하기 위해 OS에서 사용하는 변수가 필요 -> 사용자와 같으면 안되므로 OS에서는 변수를 보통 '_'로 시작한다.
	int num1;
	int math;		// 변수 이름으로 의미를 알 수 있도로 작명한다.
	int soonHeeMath; // 변수 이름으로 단어를 합쳐 만들 수 있다. 시작은 소문자, 중간 단어는 대문자로 표시.

	return 0;

}