
public class Person {

	private String name;
	private String color;
	private char gender;
	private  int age;
	private int totalFingers;
	private int totalEyes;
	
	
	public void showDetails(){
		System.out.println("name :" + this.name);
		System.out.println("age :" + age);
		System.out.println("gender :" +gender);
		System.out.println("color :" + color);
		System.out.println("totalEyes :" + totalEyes);
		System.out.println("totalFingers :" + totalFingers);
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getTotalFingers() {
		return totalFingers;
	}


	public void setTotalFingers(int totalFingers) {
		this.totalFingers = totalFingers;
	}


	public int getTotalEyes() {
		return totalEyes;
	}


	public void setTotalEyes(int totalEyes) {
		this.totalEyes = totalEyes;
	}
	
	
}
