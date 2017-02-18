
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

import java.util.Scanner;


public class  Display{

   public static void show(String msg){
   
      if(msg==null){
        NullPointerException e  = new NullPointerException("msg is empty");
		 throw e;
	   }
      msg = msg.toUpperCase();
	  
	  System.out.println("your msg is : " +msg);
   
   }


}//class





