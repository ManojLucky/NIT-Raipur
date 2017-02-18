
public class SisBike extends Bike implements Flyable,Swimable{

	public SisBike(String name, String modelNumber) {
		super(name, modelNumber);
	}

	public void fly() {
		System.out.println("bike " +name +"is flying....");
	}

	public void swim() {
		System.out.println("bike " +name +"is swiming....");
		
	}

}
