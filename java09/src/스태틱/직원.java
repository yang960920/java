package ����ƽ;

public class ���� {
	String name;
	int age;
	char gender;
	static int count;
	static double sum;
	
	public static void getAvg() {
		System.out.println(sum/count);
	}
	
	public ����(String name, int age, char gender) {
		count++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		sum = sum+age;
	}



	@Override
	public String toString() {
		return "���� [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
