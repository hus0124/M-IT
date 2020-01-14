package chap11_LogicalCompare;

public class Member {
	String id;
	String pw;
	
	public Member(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	@Override			//toSring�� �������ϸ鼭 ��� ��� �ٸ��� ���� �� �ִ�.
	public String toString() {
		return "id:" + id + ", pw: " + pw;
	}
	
	@Override			//hashcode �������̵� ������
	public int hashCode() {
		return Integer.valueOf(pw);
	}
	
	@Override
	public boolean equals(Object obj) {		// Object�� ��� �͵��� �θ� Ŭ����. �θ� Ŭ������ ���� �޴� �Ͱ� ����.
		Member m = (Member)obj; 	// �θ�Ŭ���� obj�� �ڽ� Member Ÿ������ ���� Ÿ�� ��ȯ. �θ� ���¿��� �ڽ� �ʿ� ���� �����̶�.
									// obj�� ����Ŭ�������� �ᱹ m2 ��ü. �ڽ�Ŭ���� Member���� �������. ��������ȯ ����.
		if(id.equals(m.id) && pw.equals(m.pw))
		return true;
		else
			return false;
	}
}
