#include <stdio.h>
#include <math.h>

float main_root(void)
{
    float num1;
	printf("숫자입력 = ");
	scanf("%f", &num1); 
    printf("\n\n제곱 결과 = %f", pow(num1, 2.0));

	return 0;

}
