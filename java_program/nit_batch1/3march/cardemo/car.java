public abstract class Car {

	public void fillFuel(int ltr) {
		System.out.println("car fill fuel with " + ltr);

	}

	public void start() {
		System.out.println("car started");

	}

	public void stop() {
		System.out.println("car stoped");

	}

	abstract public void brake();

	public abstract void steering(int direction, int angle) ;

}
