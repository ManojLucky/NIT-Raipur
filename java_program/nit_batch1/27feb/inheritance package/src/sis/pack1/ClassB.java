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

public class  ClassB{
    
	
	public void showAll(){
	//sis.pack1.ClassA obj = new sis.pack1.ClassA();
	 ClassA obj = new  ClassA();
/*i has private access in sis.pack1.ClassA
	 System.out.println(obj.i);
	 */
	 System.out.println(obj.j);
	 System.out.println(obj.k);
	 System.out.println(obj.l);
	
	//obj.m1();// m1() has private access in sis.pack1.ClassA
	obj.m2();
	obj.m3();
	obj.m4();
	
	
	}
	



}//class