
public class CarDriver {

	public void drive(Car car) {
		car.fillFuel(5);
		car.start();
		//1 left 2 r 3 f
		car.steering(1,20);
		car.steering(2,40);
		car.steering(2,40);
		car.brake();
		car.stop();
		
	}

}
