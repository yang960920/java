package ȭ��DB����;

public class MemberVO {
	// MemberVO ���濡 ���� �����ʹ� Member���̺� �� ����
	// �� �÷��� ��ġ ������
	private String id;
	private String pw;
	private String name;
	private String tel;

	// ���濡 �ϳ��� ���� �־��־�� ��. ==> setter
	public void setId(String id) {
		this.id = id;
	}
	
	// ���濡 �ϳ��� ���� �����־����. ==>getter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	
	
	
}
