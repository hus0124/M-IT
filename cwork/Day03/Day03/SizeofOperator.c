/* �⺻ ������ Ÿ�� 
���� 
�Ǽ�
*/

#include <stdio.h>

int main_sizeofopertaor(void)
{
	// ������ ������ ũ�� : sizeof() ������ -> �޸��� ���� ũ�⵵ �� �� �ִ�. 
	printf("char�� ũ�� : %d\n", sizeof(char));
	printf("short�� ũ�� : %d\n", sizeof(short));
	printf("int�� ũ�� : %d\n", sizeof(int));
	printf("long�� ũ�� : %d\n", sizeof(long));
	printf("long long�� ũ�� : %d\n", sizeof(long long));
	printf("float�� ũ�� : %d\n", sizeof(float));
	printf("double�� ũ�� : %d\n", sizeof(double));
	printf("long double�� ũ�� : %d\n", sizeof(long double));
	printf("int * �� ũ�� : %d\n", sizeof(int*));

	char c = 128;		// �սǹ߻� -128~127 �ս��̶��� �˰� ���α׷����Ѵ�.
	
	short s = 124;		// -32xxx ~ 32xxx ǥ�� ����
	
	int num = 1234567;		//�ּҿ� �ִ밪 �̻��� �� �ִ´�
							// ������ �������� ũ�⸦ �����ؼ� ������ Ÿ���� �����ؾ� ��

	long long ll = 1234567890123;

	num = ll;

	float f1 = 0.1f;		//f float �ǹ� 4 ����Ʈ 
	double d1 = 0.1;		// f�� �����ϸ� ���� 8����Ʈ, �Ǽ� �⺻ �����ʹ� �����̴�

	return 0;

}