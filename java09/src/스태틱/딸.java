package ����ƽ;

public class �� {
	String name;
	char gender;
	static int count;
	static int daddy;
	public ��(String name, char gender) {
		count++;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "�� [name=" + name + ", gender=" + gender + "]";
	}
	
}
