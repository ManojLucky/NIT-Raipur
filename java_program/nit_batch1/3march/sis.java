
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

public class  Sis{

public Sis(int aq){

}
	public static void  main(String args[]) throws Exception{
		
		//class load
		Class c  = Class.forName(args[0]);
		//create object
		Object obj1 = c.newInstance();  
		System.out.println(obj1);
	
		
	}//main

}//class