/*
�ڵ�����ȯ : ���� �������� �º� �캯�� �ٸ� ��� �ڵ������� �ߵ�
*/

#include <stdio.h>

int main_casting(void)
{
	int num = 10;
	double d1 = 20;		// �캯�� int �º��� double �̹Ƿ� ����� �ڵ�����ȯ (ū ������ ��ȯ, ���� ������ �۵��� ����)
	printf("d1=%f\n", d1);

	int a = 3.14;		// �캯�� double �º��� int �̹Ƿ� �Ҽ������� �ս�
	printf("%d\n", a);
	int b = 5 / 2;		// 2.5�ε� int �� ����ȯ�Ǹ� 2.5�� �ƴ϶� 2�� ����. ���� / ���� = ���� ���͹���.
	int c = (double)5 / 2;	//	����Ÿ�Ժ�ȯ (double). ������� ����� 2.5 �׷��� �º��� int�� 2...
    printf("%f\n", (double)5 / 2);
	printf("c=%d\n", c);



	return 0;

}