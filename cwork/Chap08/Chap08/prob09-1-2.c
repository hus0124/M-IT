/*
���� 2
����(Celcius) �µ��� �Է��ϸ� ȭ��(Fahrenheit) �µ��� ��ȯ�ϴ� CelToFah��� �̸��� �Լ���
�� �ݴ�� ȭ�� �µ��� �Է��ϸ� ���� �µ��� ��ȯ�ϴ� FahToCel��� �̸��� �Լ��� �����ϰ�
�� �� �Լ��� ȣ���ϴ� ������ �ϼ��غ���.����� ������ ȭ���� �µ� ��ȯ�� ������ ������ ����.

Fah = 1.8 * Cel + 32
*/

#include <stdio.h>
double CelToFah(double Cel);
double FahToCel(double Fah);

int main_0912(void) 
{ 
	printf("���ϴ� ��ȯ ���� (1 = CelToFah / 2 = FahTocel) : ");
	int num;
	double num1, num2;
	scanf("%d", &num);
	switch (num)
	{
	case 1:
		printf("���� �µ�(C) = ");
		scanf("%lf", &num1);
		printf("%fF", CelToFah(num1));
		break;
	case 2:
		printf("ȭ�� �µ�(F) = ");
		scanf("%lf", &num2);
		printf("%f��", FahToCel(num2));
		break;
	default :
		printf("1 �Ǵ� 2�� �Է��ϼ���");
	}
	return 0; 
}

double CelToFah(double Cel) { 
	return 1.8 * Cel + 32;
}

double FahToCel(double Fah) {
	return (Fah - 32) / 1.8;
}
