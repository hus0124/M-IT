/*
if 조건문도 중첩이 된다

if (age >=10 && age < 20)
{  if (gender=="남") 
        printf("10대 남");
   else printf("10대 여");
 }
 
 else if (age >=20 && age < 30)
{  if (gender=="남")
		printf("20대 남");
   else printf("20대 여");
 }
 
 else
 {  if (gender=="남")
		printf("그외 남");
   else printf("그외 여");
 }
   */
#include <stdio.h>

int main_nestedif(void)
{
	int age, gender;
	scanf("%d", &age);
	printf("\n");
	scanf("%s", &gender)
	if (age >= 10 && age < 20)
	{
		if (gender == "남")
			printf("10대 남");
		else printf("10대 여");
	}

	else if (age >= 20 && age < 30)
	{
		if (gender == "남")
			printf("20대 남");
		else printf("20대 여");
	}

	else
	{
		if (gender == "남")
			printf("그외 남");
		else printf("그외 여");
	}
	return 0;
}