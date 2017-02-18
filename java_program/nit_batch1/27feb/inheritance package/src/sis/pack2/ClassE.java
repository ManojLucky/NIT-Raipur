package sis.pack2;
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
import sis.pack1.ClassA;

public class  ClassE{
	
    
	public void showAll(){
	//sis.pack1.ClassA obj = new sis.pack1.ClassA();
	 ClassA obj = new  ClassA();
//i has private access in sis.pack1.ClassA
	 //System.out.println(obj.i);
	 System.out.println(obj.j);
	 
	 /*
	  k has protected access in sis.pack1.ClassA
	 System.out.println(obj.k);
	 
	l is not public in sis.pack1.ClassA
	 System.out.println(obj.l);
	*/
	
	
	obj.m2();
	/*
	obj.m1();// m1() has private access in sis.pack1.ClassA
	obj.m3();//m3() has protected access
	obj.m4();// m4() is not public in
	*/
	
	
	}
	



}//class