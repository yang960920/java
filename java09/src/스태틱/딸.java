package ½ºÅÂÆ½;

public class µş {
	String name;
	char gender;
	static int count;
	static int daddy;
	public µş(String name, char gender) {
		count++;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "µş [name=" + name + ", gender=" + gender + "]";
	}
	
}
