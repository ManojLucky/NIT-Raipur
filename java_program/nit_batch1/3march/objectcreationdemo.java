
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
public class ObjectCreationDemo {


	public static void main(String[] args) throws Exception{
		
		//how to load class
		
		String myclass ="";
		 myclass ="java.util.Date";
	 
		Class c  = Class.forName(myclass);
		//Class c  = Class.forName("java.util.Date");
		//create object
		Object obj1 = c.newInstance();  
		System.out.println(obj1);
		
		 
		
		
		

	}

}
