/* ���ѹݺ��� ���ҽ� ���� ���ٷ� �ٶ������� �ʴ�
��������� ������ִ� ���� �ʿ��ϴ�
*/

#include <stdio.h>

int main_infinity(void)
{
	int i = 0;
	while (1)	// ���ǽ� ���� (1 : ��)
	{
		printf("���ѹݺ��մϴ�.\n");
		if(i++ > 1000)
			break;
	}

	int run = 1;
	while (run)
	{
		if (i++ < 10000)		//scanf �Է� �޾Ƽ� ���� �޴��� �����ϸ� ���ᰡ��.
			run = 0;
	}
	return 0;
}