/*
const : constant ����� ����
����� ������ �ʴ� ��

*/

#include <stdio.h>
int add(const int a, const int b)
{
	int main_const(void)
		; {
		int num = 10;		//����
		num = 20;		// ������ ���� ����

		const int Count = 20;			// ����� �����Ѵ�. ����� ���������� �빮��, �ܾ� ������ ����� �̿�
		// Count = 30; �� �κ� ����. ��� ���� ����

		int num2 = 40;
		int sum = add(num, num2);



		return 0;
	}
}