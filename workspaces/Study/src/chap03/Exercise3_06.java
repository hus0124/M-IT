package chap03;

public class Exercise3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = (lengthTop + lengthBottom) * height / 2;				// �캯�� ��·�� �����̴� �Ҽ��� �����ؼ� 52.0 ���� ����
		double area1 = (lengthTop + lengthBottom) * height / 2.0;
		double area2 = (double)(lengthTop + lengthBottom) * height / 2;
		double area3 = (lengthTop + lengthBottom) * (double)height / 2;
		double area4 = (double)((lengthTop + lengthBottom) * height / 2);	// �� ��. ����� �̹� 52���� ����� �غ��� 52.0 ��.
		
		System.out.println("��ٸ����� ����3 = " + area);		// �ȵ�
		System.out.println("��ٸ����� ����1 = " + area1);
		System.out.println("��ٸ����� ����2= " + area2);
		System.out.println("��ٸ����� ����3 = " + area3);
		System.out.println("��ٸ����� ����3 = " + area4);	// �ȵ�

	}

}
