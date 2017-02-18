
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
 *Mar 8, 2016
 * 
 */
public abstract class Bike {
     protected String name;
     protected String ModelNumber;

     
	
	public Bike(String name, String modelNumber) {
		this.name = name;
		ModelNumber = modelNumber;
	}



	public void start(){
		System.out.println("bike" + name + "Started") ;
	}
	
	public void stop(){
		System.out.println("bike" + name + "stop") ;
	}
	
	public void move(){
		System.out.println("bike" + name + "moving....") ;
	}
	
}
