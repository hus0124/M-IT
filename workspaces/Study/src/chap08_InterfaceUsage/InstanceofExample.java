package chap08_InterfaceUsage;

public class InstanceofExample {

	public static void main(String[] args) {
		RemoteControl rc = new SettopBox();	// �������̽� Ÿ�� ���� �̸� = ���� ��ü �̸�, �ڵ�Ÿ�Ժ�ȯ
//		���� rc.volume(10); ���� ��ü�� �ʵ忡�� ������ �� ��. ���� Ÿ�� ��ȯ �ʿ�.
		
		SettopBox sb = (SettopBox)rc;	// ���� Ÿ�� ��ȯ�� ������ ������ rc �� new SettopBox�� �ڵ�Ÿ�Ժ�ȯ �߱� ����
		
//		���� Television tv = (Television)rc;  �Ǵ� ��ó�� �������� ����. class cast exception.
		
		if(rc instanceof Television){
			System.out.println("Television�� ����Ÿ�Ժ�ȯ ����");
			Television tv = (Television)rc;
		}
		else if(rc instanceof SettopBox){
			System.out.println("SettopBox�� ����Ÿ�Ժ�ȯ ����");
			SettopBox s2 = (SettopBox)rc;
		}
	}

}
