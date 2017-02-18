
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

class  StringDemo1{
	public static void  main(String args[]){
		
String sis = "Success is Sure";
System.out.println(sis.length());   
sis= "  Success is Sure      ";
System.out.println(sis.length());   
sis = sis.trim();
System.out.println(sis.length());   
System.out.println(sis.contains("sis"));   
System.out.println(sis.contains("uttam"));   
System.out.println(sis.contains("success"));   
System.out.println(sis.contains("Success"));   
System.out.println("-------------");   
		
System.out.println(sis.indexOf("is"));   
System.out.println(sis.lastIndexOf("is"));   

sis = "Success is Sure  Success is Sure";
System.out.println(sis);   

System.out.println(sis.replaceFirst("is" ,"XYZ"));   
System.out.println(sis.replaceAll("is" ,"XYZ"));   
		
		
		
	}//main

}//class