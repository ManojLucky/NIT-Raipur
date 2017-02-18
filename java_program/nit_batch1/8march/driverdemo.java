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
 * @author Surendra Mar 8, 2016
 * 
 */
public class DriverDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bike bike = null;
		// bike =

		// Error bike = new Bike();//abstract class
		//bike = new HondaBike("Honda", "1000");//normal bike
		//bike = new HeroBike("Hero", "2000");//normal bike
		bike = new SisBike("SIS", "3000");//normal bike

		Driver driver = new Driver();
		driver.drive(bike);

	}

}
