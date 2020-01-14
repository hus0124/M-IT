package chap07_method_override;

public class LaserPrinter extends Printer {
	// �θ� ��ü�� print() �޼ҵ带 ������ ����.
	// �ڽŸ��� ������� ����� �ϰ� �ʹ� �� �޼ҵ� �������̵�(Override, Overriding)
	// �������̵�   �����ε� �� ���� �ٸ� ����.  �������̵��� ��� ������,  �����ε��� ������ �Ű����� ���߼���.
	
	/* @Override
	public void print(String data) {
		// TODO Auto-generated method stub
		super.print(data);				// �������̵� ����Ʈ ����. ����Ʈ�� �θ��� �޼ҵ� �״���� ����.
	}*/

	@Override
	public void print(String data) {
		System.out.println("�������� ����մϴ�(" + data + ")");
		super.print(data);
	}
}
