/*
if ���ǹ��� ��ø�� �ȴ�

if (age >=10 && age < 20)
{  if (gender=="��") 
        printf("10�� ��");
   else printf("10�� ��");
 }
 
 else if (age >=20 && age < 30)
{  if (gender=="��")
		printf("20�� ��");
   else printf("20�� ��");
 }
 
 else
 {  if (gender=="��")
		printf("�׿� ��");
   else printf("�׿� ��");
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
		if (gender == "��")
			printf("10�� ��");
		else printf("10�� ��");
	}

	else if (age >= 20 && age < 30)
	{
		if (gender == "��")
			printf("20�� ��");
		else printf("20�� ��");
	}

	else
	{
		if (gender == "��")
			printf("�׿� ��");
		else printf("�׿� ��");
	}
	return 0;
}