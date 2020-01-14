/*
����ü
*/

#include <stdio.h>

typedef struct
{
	int mem1, mem2; //���� 4����Ʈ
	double mem3;	//8����Ʈ
} Struct;

typedef union
{
	struct ddd
	{
		short high;	//2 ����Ʈ
		short low;	//2 ����Ʈ
	};
	
	int mem3; // 4����Ʈ = high 2 + low 2
} Union2;		// ����ü�� ũ��� ���� ū �����Ϳ� ����.  ���� 4 + 8 = 12�� ������ mem3 �� 12 �� 8����Ʈ.

typedef struct bbb
{
	char a;		// 1����Ʈ
	char dummy[3];
	int num;	// 4����Ʈ
}BBB;	// �ٵ� �̰� ����غ��� 8����Ʈ�̴�. int 4����Ʈ�� ���߾� char ���� 4 ����Ʈ �Ҵ�. ���̿� char dummy[3]�� �ִ°Ŵ�.


int main(void) 
{
	/*printf("����ü structure �� �޸� ũ�� = %d\n", sizeof(Struct)); // 4 + 4 + 8 = 16
	printf("����ü union �� �޸� ũ�� = %d\n", sizeof(Union));	  // 8 = ( 4 + 4)	
	printf("\n");

	printf("%d\n", sizeof(BBB));
	*/
	Union2 u2;
	u2.mem3 = 0x00111100;		// mem3 �� ������
	printf("int mem3 = %x\n", u2.mem3);
	printf("high = %x, low = %x\n", u2.ddd.high, u2.ddd.low);
	
	return 0;
}