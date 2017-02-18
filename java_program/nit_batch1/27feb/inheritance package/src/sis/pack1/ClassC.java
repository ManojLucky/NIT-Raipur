package sis.pack1;
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

public class  ClassC  extends ClassA{


	public void showAll(){
	 /*i has private access in sis.pack1.ClassA
	 System.out.println(i);
	 */
	 System.out.println(j);
	 System.out.println(k);
	 System.out.println(l);
	
	//m1();// m1() has private access in sis.pack1.ClassA
	m2();
	m3();
	m4();
	
	
	}
	



}//class