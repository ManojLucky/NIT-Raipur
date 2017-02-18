
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

import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
//import static java.lang.Math.*;

import static java.lang.System.out;
public class  StaticImportDem2{
	public static void  main(String args[]){
		
	  //a^2-b^2
		
		String strNum ="100";
		/*int x  = Integer.parseInt(strNum);
		System.out.println(Math.pow(x, 2));
		*/
		int x  = parseInt(strNum);
		 
		
		int a=10;
		int b=5;
		//double  result  = Math.pow(a, 2) -Math.pow(b, 2);
		double  result  = pow(a, 2) - pow(b, 2);
		System.out.println(result);
		double cal=  2 * PI * 2.5;
		System.out.println(cal);
		out.println(cal);
		
		
		
		
		
		
		
	}//main

}//class