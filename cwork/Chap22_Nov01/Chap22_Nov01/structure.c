/*
����ü
������ �����͸� ���� ��
*/

#include <stdio.h>
//����ü ���Ǹ� �� �κп��� ���� : ����� ���� ������ Ÿ��
struct point	// ��ǥ�� ���� ����ü
{
	int xpos;	// x ��ǥ
	int ypos;   // y ��ǥ
};

struct person
{
	char name[20];		//�ѱ��� 1�� 3byte 
	char phoneNum[20];  //��ȭ��ȣ 010 ó�� 0�� �տ� ������ int �� ���� �ȵǴ� char �� �Ѵ�.
	int age;
	char ssn[15];

};

int main_struc(void)
{		//���� ��ǥ�� �д´�
	struct point left;		// ������ Ÿ�� : struct point, �����̸� : left
	struct point right;

	printf("��ǥ�� �Է��ϼ���(x, y) : ");
	scanf("%d %d", &left.xpos, &left.ypos);	//�����̸�.����̸�

	printf("��ǥ�� �Է��ϼ���(x, y) : ");
	scanf("%d %d", &right.xpos, &right.ypos);

	printf("left ��ǥ�� : (%d, %d)\n", left.xpos, left.ypos);
	printf("right ��ǥ�� : (%d, %d)\n", right.xpos, right.ypos);

	//ȫ�浿 ���� �Է�
	struct person hong; // ������Ÿ��, �����̸�
	printf("�̸� : ");
	scanf("%s", hong.name);

	printf("��ȭ��ȣ : ");
	scanf("%s", hong.phoneNum);

	printf("����: ");
	scanf("%d", &hong.age);		//���ڿ��� scanf�� & �ʿ� ������ int ���� �ּ�ǥ�� �ʿ�

	printf("�ֹι�ȣ : ");
	scanf("%s", hong.ssn);

	printf("\n\n");
	printf("�̸� : %s\n", hong.name);
	printf("��ȭ��ȣ : %s\n", hong.phoneNum);
	printf("���� : %d\n", hong.age);
	printf("�ֹι�ȣ : %s\n", hong.ssn);

	return 0;
}