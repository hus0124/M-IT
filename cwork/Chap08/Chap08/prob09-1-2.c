/*
문제 2
섭씨(Celcius) 온도를 입력하면 화씨(Fahrenheit) 온도를 반환하는 CelToFah라는 이름의 함수와
그 반대로 화씨 온도를 입력하면 섭씨 온도를 반환하는 FahToCel라는 이름의 함수를 정의하고
이 두 함수를 호출하는 예제를 완성해보자.참고로 섭씨와 화씨간 온도 변환의 공식은 다음과 같다.

Fah = 1.8 * Cel + 32
*/

#include <stdio.h>
double CelToFah(double Cel);
double FahToCel(double Fah);

int main_0912(void) 
{ 
	printf("원하는 변환 선택 (1 = CelToFah / 2 = FahTocel) : ");
	int num;
	double num1, num2;
	scanf("%d", &num);
	switch (num)
	{
	case 1:
		printf("섭씨 온도(C) = ");
		scanf("%lf", &num1);
		printf("%fF", CelToFah(num1));
		break;
	case 2:
		printf("화씨 온도(F) = ");
		scanf("%lf", &num2);
		printf("%f℃", FahToCel(num2));
		break;
	default :
		printf("1 또는 2를 입력하세요");
	}
	return 0; 
}

double CelToFah(double Cel) { 
	return 1.8 * Cel + 32;
}

double FahToCel(double Fah) {
	return (Fah - 32) / 1.8;
}
