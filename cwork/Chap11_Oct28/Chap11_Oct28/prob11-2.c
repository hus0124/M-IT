/*
���� 2. char�� 1���� �迭�� ����� ���ÿ� ���� ������ ��������
�ʱ�ȭ�ϰ�, �ʱ�ȭ ���Ŀ��� ����� ������ ����ϴ� ������
�ۼ��� ����.
"Good time"

[��Ʈ]
scanf("%c")�� ��� : �ݺ����� ����ؼ� �� ���ھ� ���
% s : �ܾ� ���->���ڿ��� ' '�� �����Ƿ� ���
puts()�� ����ϸ� �ذ��� �ǳ�, ���������� ������� ����
���ڿ��� �׻� ���� \0 �ϳ� �� ���� �ִ�.
*/

#include <stdio.h>
// #include <string.h>

int main_prob11_2(void)
{
	char buffer[] = "\"Good time\"";		// �̷��� ����θ� �˾Ƽ� �迭 ũ�Ⱑ ������
	// buffer [i] != '\0' 

	for (int i = 0; ; i++)		// ������ i < sizeof(buffer) - 1 �ص� �ȴ�. 
	{
		printf("%c", buffer[i]);
		if (buffer[i] == '\0')
			break;
	}
	printf("\nsize of array = %d\n", sizeof(buffer));

	// strlen : string length ���ڿ��� ���̸� ���ϴ� �Լ�. #include <string.h> ���ڿ� ���� ���̺귯�� �ʿ�.

	for (int i = 0; i < strlen(buffer); i++)		 
	{
		printf("%c", buffer[i]);
		
	}
	return 0;
}
