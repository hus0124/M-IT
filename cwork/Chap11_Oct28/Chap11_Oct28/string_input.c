/*
���ڿ� �Է� : �����Ϸ��� �迭�� �ʿ�. �迭�� ũ�� �˾ƾ�.

*/

#include <stdio.h>
#include <string.h>

int main_stringinput(void)
{
	char buffer[1024];	//�� ����Ʈ���� �𸣴� ����Ǵ� ũ�⺸�� ũ�� ����.
	printf("���ڿ� �Է� : ");
	scanf("%s", buffer);	// scanf &(�ּ�) ó�� char �迭�� �ּҴ� �׳� �迭 �̸�. 
	//scanf("%s", buffer) �� �ܾ� ������ �Էµȴ�. ���� �ܾ� ������ �ϳ��ۿ� �� ���´�.
	printf("%s\n", buffer);
	printf("���ڿ��� ũ�� = %d\n", strlen(buffer));

	int ch = getchar();		// \n ���͸��� ������ �о���̴� ����, getchar() �� ���ھ� �о� �鿩 int ch�� �Է½�Ŵ.

	printf("���ڿ� �Է� : ");		// ���ڿ��� ���� �ܾ�, �� ������ �Է��Ϸ���
	gets(buffer);		// stdio.h ���� ���ǵ� ���̺귯�� �Լ�. ������ �Է��ϰ� �Ѵ�. scanf ��� �Է� ���.
	printf("%s\n", buffer);
	printf("���ڿ��� ũ�� = %d\n", strlen(buffer));

	int num;
	// sscanf(buffer, "%d", &num);			// �迭���� �Է¹���.
	// fscanf(stdin, "%d", &num);			//���Ͽ��� �Է¹���.

	fgets(buffer,1024, stdin);		// gets �� �����ѵ� ���Ͽ��� 
	printf("%s\n", buffer);
	printf("���ڿ��� ũ�� = %d\n", strlen(buffer));
	printf("%d", ch);
	return 0;
}