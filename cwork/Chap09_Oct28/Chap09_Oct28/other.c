/* other.c 파일에서 glovalVariable.c 에 선언된 전역변수 num을
  사용하고 싶다면

  */

extern int num;		// extern : 다른 파일에 변수가 존재한다는 뜻.
// extern static int total; // static은 다른 파일로 못 가져온다. 에러 난다.

void callFuncTwo()
{
	int var2 = num + 60;	// num이 여기선 지정안된 상태라 에러.
							// 그러나 extern 지정해주면 에러 안남.

	//int var3 = total - 40;	// total도 스태틱이라 다른 파일에서 접근 불가능.
}
  
