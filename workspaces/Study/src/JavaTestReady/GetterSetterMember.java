package JavaTestReady;
/*
  �Ʒ� ȸ�������� ������ Member Ŭ������ ���Ͽ� �ʵ带 private ���� �����ڸ� ����ϰ�, 
 Getter�� Setter �޼ҵ带 �����Ͽ� Member.java ������ �ۼ��Ͻÿ�.

�������̸�		�ʵ��̸�		Ÿ��
�̸�			name		���ڿ�
���̵�		id			���ڿ�
�н�����		password	���ڿ�
���ο���		adult	��(boolean)

 */
public class GetterSetterMember {

	private String name;
	private String id;
	private String password;
	private boolean adult;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdult() {	// boolean getter�� is 
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
}
