package chap11_LogicalCompare;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("ȫ�浿", "1234");
		Member m2 = new Member("ȫ�浿", "1234");
		
		if(m1.hashCode()==m2.hashCode()){System.out.println("���� �ؽ��ڵ� ��");}
		else{System.out.println("�ٸ� �ؽ��ڵ尪");}
		
		if(m1.equals(m2)){System.out.println("�� ��ü�� �����ϴ�");}
		else {System.out.println("�� ��ü�� �ٸ�");}
		
		if(m1==m2){System.out.println("�� ��ü�� �ּҰ� �����ϴ�");}
		else {System.out.println("�� ��ü�� �ּҰ� �ٸ�");}
		
		// ���� ���� �񱳽� hashcode �������̵� �ʿ�. ���� �ּҰ��� �ٰ��� hashcode�� ������ ����� ���� ���� �񱳰� ����.
		// hashcode ���ϰ��� equal ���ϰ��� ���ƾ� ���� ��ü �����ȴ�.
		// ���������� �ٸ� �ּ��� ��ü���� ���� ���� ���ϱ� ���� hashcode �������̵� �Ѵ�.
		
		System.out.println(m1.toString());	// toString : ��ü ������ ����Ѵ�.
		System.out.println(m2.toString());
		
	}

}
