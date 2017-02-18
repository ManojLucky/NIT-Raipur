
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

public class  Demo{
	public static void  main(String args[])throws Exception{
		
		for(String className : args){

			Class c  = Class.forName(className);

			Object obj  = c.newInstance();
			
			if(obj instanceof  SIS){
				   SIS s = (SIS)obj;
						s.setAll();
						s.showDetails();
		  }//if
		  
	}//for
		
		
	}//main

}//class