/* 
���� ���� ���� ������ ���ϴ� ���
2�� ������ ���Ѵ�.
1�� ���� + 1
1�� ���� : num -> ~num ���� �ٲ۴�
*/

#include <stdio.h>

int main_operationnagative(void)
{
	int num1 = 15;
	int num2 = ~num1 + 1;
	printf("NOT ���� �� ���� ��� : %d\n", num2);
	printf("16���� ��� 0x%x\n", num1);

		int num = 0xffffffff;
		printf("16���� ��� 0x%x\n", num);
		num = num & 0xfefefefe;		//e: 14(1110) ��Ʈ 0���� masking ��Ų��. �� ��Ʈ�� 0���� ��������(And ���� 0 �̴ϱ�)
		printf("16���� ��� 0x%x\n", num);
		num = num | 0x01010000;		// ��Ʈ 1 �� masking ��Ų��. (Or ���� 1 �ϳ��� ������ 1)
		printf("16���� ��� 0x%x\n", num);
		num = 0x01;
		printf("16���� ��� 0x%x\n", num);
		num <<= 4;	// �������� 4��Ʈ �̵� (�������� 1��Ʈ �̵� -> * 2 ȿ��)
		printf("16���� ��� 0x%x\n", num);
		num >>= 2;	// ���������� 2��Ʈ �̵� (���������� 1��Ʈ �̵�-> /2 ȿ��)
		printf("16���� ��� 0x%x\n", num);
		// 16�� 2^4  ���������� 2��Ʈ �̵�, 4�� �����ؼ� 4

		int num3 = 16;
		printf("0x%x\n", num3);
			return 0;
}