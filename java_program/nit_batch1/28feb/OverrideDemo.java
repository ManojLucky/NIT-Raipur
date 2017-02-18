
/* 
SIS: Surendra IT SOlution
Auther: Surendra Kumar  Sao
S/W Architech & Corporate s/w Trainer
+25 projects exp. from scratch.
Java Certified :  SCJP(98%)  & SCWCD(98%)
MCA from NIT Raipur
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G) India
*/

public class  OverrideDemo{
	public static void  main(String args[]){
	
	Parent p  = new Parent();
	p.properties();
	p.marry();
	
	System.out.println("--------------child------------");
	
	Child c = new Child();
	
	c.properties();
	c.marry();
	
	
	
	
	
	
	}//main

}//class