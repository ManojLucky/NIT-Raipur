
public class HeroBike extends Bike implements Flyable{

	public HeroBike(String name, String modelNumber) {
		super(name, modelNumber);
	}

	public void fly() {
		System.out.println("bike " +name +"is flying....");
	}

}
