
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

import java.util.*;

public class  SBDemo{
	public static void  main(String args[]){

   	Scanner scan = new Scanner(System.in);
	StringBuffer aboutMe = new StringBuffer();
    String option = null;

	System.out.println("enter your details");
	while(true){
	    aboutMe.append(scan.nextLine()+"\n");
		System.out.println("do you want continue for no enter  no/NO");
		option  = scan.nextLine();
		if("no".equalsIgnoreCase(option)){
		  break;
		}
		System.out.print("add more data>>");
		
		}
	
	
	System.out.println("your entered data");
	System.out.println(aboutMe);
	
	String str  = aboutMe.toString();
	System.out.println(str.toUpperCase());
	
	
	
	}//main

}//class