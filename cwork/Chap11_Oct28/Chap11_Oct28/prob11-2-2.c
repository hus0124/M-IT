/*
���� 2. ���α׷� ����ڷκ��� ���ܾ �Է� �޾Ƽ� char��
	�迭�� �����Ѵ�. �� ���� �迭�� ����� ���ܾ ��������
	�����´�. ���� �̶��� ��('\0') ������ ��ġ�� �����ؼ���
	�ȵȴ�. ������ ������ ����� ������ ������ Ȯ���ϱ� ���ؼ�
	����� ����. ��) "hello" -> 'olleh"

	������ �ǵ��� ��¸� ����� ������ �� �� �ƴ϶�
	����� �����͸� �������� �ٽ� ������ ���� �ʿ��ϴٴ� ��.

	*/

#include <stdio.h>

/*int strlen(char arr[])
{
	int i;
	for (i = 0; arr[i] != '\0'; i++)
	{
		return i;
	}

}*/
int main_prob11_2_2(void)
{
	char buffer[256];
	printf("�ܾ� �Է� : ");
		scanf("%s", buffer);
		int len = strlen(buffer);
		for (int i = 0; i < len / 2; i++)
		{
			char tmp = buffer[i];				// buffer[i] �� buffer[len - 1 - i] ��ġ ��ȯ
			buffer[i] = buffer[len - 1 - i];
			buffer[len - 1 - i] = tmp;
		}
		printf("%s\n", buffer);

		return 0;
}