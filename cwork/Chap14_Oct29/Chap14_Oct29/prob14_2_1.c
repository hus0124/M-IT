/*
���� 1
�Ʒ��� ���ǵ� �Լ��� ����. ���ڷ� ���޵Ǵ� ������ �����Ͽ� int�� �迭��� ��ü�� ����ϴ� �Լ��̴�.

void ShowAllData(const int * arr, int len)
{
	int i;
	for(i = 0;i < len;i++)
		printf("%d ", arr[i]);
}

�� �Լ��� �Ű����� ���𿡼� arr�� ������� const ������ �� ������ �����̰ڴ°�? �� �Լ��� ������ ����� �ǵ��� �̾߱��� ����.
*/

#include <stdio.h>

void ShowAllData(const int* arr, int len)
{
	int i;
	for (i = 0; i < len; i++)
		printf("%d ", arr[i]);
}

int main_1421(void)
{
   
	return 0;
}