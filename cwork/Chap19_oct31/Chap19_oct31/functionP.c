/* �Լ� ������
�Լ��� �ּҸ� �����ϰ�, �����͸� ����ؼ� �Լ��� �����ϴ� ��� ���� �ּҸ� ����
�Լ� : 
��ȯ�� �Լ� �̸�(�Ű�����) {....}
�Լ� �̸��� �� �Լ��� �ּҸ� �ǹ��Ѵ�.
�Լ� ������ 
��ȯ�� (*fptr) (�Ű�����)
*/

#include <stdio.h>

int add(int a, int b)
{
	return a + b;
}

int main_funcp(void)
{
	int a = 10, b = 20;
	int sum = add(a, b);
	printf("�� = %d\n", sum);

	//�Լ� ������ ��� �� : ��ȯ�� (*fptr)(�Ű�����)
	int (*fptr)(int, int) = add;		// add �Լ��� �ּ� fptr ����
	sum = fptr(30, 40);		// add(30, 40) �� ����
	
	printf("�Լ� ������ ���� �̿��� �� = %d\n", sum);
	
	// ������ : �ּ�, ������ Ÿ��(int double ��)
	// �Լ� ������ : �ּ�, ��ȯ��, �Ű�����

	double d1 = 2.4;
	double* dptr = &d1;

	// *dptr = &a; ������ Ÿ�� �޶� �Ұ���. 

	return 0;
}