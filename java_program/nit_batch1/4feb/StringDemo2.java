
/* 
auther: surendra kuamr  sao
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

class  StringDemo2{
	public static void  main(String args[]){


String s1 ="Hello";
String s2 = new String("Hello");

String s3 = new String("HELLO");
	
System.out.println(s1.equals(s2));//??T
System.out.println(s1.equals(s3));//??F
System.out.println(s2.equals(s3));//??F
System.out.println(s2.equalsIgnoreCase(s3));//??t
	
		
	
	}//main
}//class