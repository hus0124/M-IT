/* other.c ���Ͽ��� glovalVariable.c �� ����� �������� num��
  ����ϰ� �ʹٸ�

  */

extern int num;		// extern : �ٸ� ���Ͽ� ������ �����Ѵٴ� ��.
// extern static int total; // static�� �ٸ� ���Ϸ� �� �����´�. ���� ����.

void callFuncTwo()
{
	int var2 = num + 60;	// num�� ���⼱ �����ȵ� ���¶� ����.
							// �׷��� extern �������ָ� ���� �ȳ�.

	//int var3 = total - 40;	// total�� ����ƽ�̶� �ٸ� ���Ͽ��� ���� �Ұ���.
}
  
