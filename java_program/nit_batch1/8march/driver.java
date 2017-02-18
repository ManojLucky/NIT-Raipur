
public class Driver {

	public void drive(Bike bike) {
		bike.start();
		bike.move();
		bike.stop();
		
		//fly
		//swim
		//bike.fly();
		
		if(bike instanceof Flyable){
			//bike.fly();
			Flyable flyBike  = (Flyable)bike;
			flyBike.fly();
		}
		
		if(bike instanceof Swimable){
			//bike.fly();
			Swimable swimBike  = (Swimable)bike;
			swimBike.swim();
		}
		
		
		
	}

}
