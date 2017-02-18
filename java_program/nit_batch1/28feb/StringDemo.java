
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

public class  StringDemo{
	public static void  main(String args[]){
		
		String str  = new String("SIS");
		MyString myStr  = new MyString("SIS");
			
		System.out.println(str);//SIS
		System.out.println(myStr);//SIS
		System.out.println(myStr.toString());//SIS
		
		
		Integer iobj = new Integer(10);
		MyInteger myObj = new MyInteger(10);
		System.out.println(iobj);//10
		System.out.println(myObj);//??
		System.out.println(myObj.toString());//??
		
		
		
		
		
	}//main

}//class