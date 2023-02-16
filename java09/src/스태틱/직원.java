package 스태틱;

public class 직원 {
	String name;
	int age;
	char gender;
	static int count;
	static double sum;
	
	public static void getAvg() {
		System.out.println(sum/count);
	}
	
	public 직원(String name, int age, char gender) {
		count++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		sum = sum+age;
	}



	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
