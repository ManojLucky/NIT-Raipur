
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

public class  NumberSum2{
	public static void  main(String args[]){

     int min=1; 
	 int max=5;
	 int sum=0;
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("plz provide "+ max +" number");
	 while(min<=max){
	   
	   
	   String str = input.nextLine();
	   
	   try{
	   
	   int num = Integer.parseInt(str);
	  sum = sum+num;
	   
	   }catch(NumberFormatException e){
	      System.out.println("why you have not enter number");
		  //system.exit(o)  jvm can not do
		  continue;
	   }catch(Exception e){
	      //todo
		  System.out.println("Error" + e.getMessage());
	   }
	   
	 min++;
	   
	 }
	 
	 System.out.println("total sum =" + sum);
	 
	 
	
	}//main

}//class





