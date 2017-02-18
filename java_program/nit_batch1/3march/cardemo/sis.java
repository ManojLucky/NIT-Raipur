import java.util.Random;


/**
SIS: Surendra IT Solution
Auther: Surendra Kumar  Sao
S/W Architech & Corporate s/w Trainer
Exp. +7.5Yr in Sw Development.
+28 projects exp. from scratch.
Java Certified :  SCJP(98%)  & SCWCD(98%)
MCA from NIT Raipur
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G) India

 */

/**
 * @author Surendra
 *Mar 3, 2016
 * 
 */
public class SIS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car car  = getCarFromGarage(); 
		System.out.println(car);
/*         car = new MarutiCar();
         car = new CantroCar();*/
		CarDriver driver = new CarDriver();
			driver.drive(car);
		

	}

	private static Car getCarFromGarage() {
		Car car =null;
		Car []cars ={ new CantroCar(),new MarutiCar()};
		
		int carIndex = new Random().nextInt(cars.length);
		car  = cars[carIndex];
		return car;
	}

}
