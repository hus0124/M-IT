/*
���� 2. ���� ���� �����ϴ� ��� A�� Z�� ���ϴ� ���α׷��� �ۼ�
	�غ���.

	A Z
  + Z A
 ------
	9 9
*/

#include <stdio.h>

int main_0822(void)
{
	/*int A, Z;

	for (A = 0; A < 10; A++)
	{
		for (Z = 0; Z < 10; Z++)
		{
			if (A + Z == 9)
			{
				printf("%d %d\n", A, Z);
			}

		}
	}
	*/

	int A, Z;

	for (A = 0; A < 10; A++)
	{
		for (Z = 0; Z < 10; Z++)
		{  
			if (A == Z)
			{
				continue;			// �ٵ� ������ A = Z �̸� 9 �� ������ ��� �ǹ̴� ����
			}
			if ((A*10 + Z + Z*10 +A) == 99)
			{
				printf("A=%d, Z=%d\n", A, Z);
				printf("%d%d + %d%d = 99\n\n", A, Z, Z, A);
				break;				// A + Z = 9 �ƴ� ���� �������� �ʵ��� break �ɾ ȿ���� ����
			}
		}
	}
	return 0; 
}