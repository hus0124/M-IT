#include <stdio.h>

int main_compel(void)
{
	int math = 91;
	int eng = 100;
	int sum = math + eng;
	double avg = sum / 2;			// ���� ������ ������ �̹� �Ҽ��� ����. ����� �־ �Ҽ��� �̹� ����.
									// ��� �� �� ��� ��� �� ���� �����̾�� �Ѵ�. �̰� �ڵ�����ȯ �ȴ�. int -> double
									// �ƴϸ� ���� ����ȯ �ʿ�

	printf("���� ��� = %f\n", avg);

	double avg2 = (double)sum / 2;	// sum�� ����� ���� ����ȯ
	printf("avg2 = %f\n", avg2);
	return 0;
}