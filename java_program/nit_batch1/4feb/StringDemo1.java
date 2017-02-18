
/* 
auther: surendra kuamr  sao
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

class  StringDemo1{
	public static void  main(String args[]){


	String s1 ="Hello";
	String s2 ="Hello";
	String s3 ="surendra";
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1==s2);//true   
	System.out.println(s1==s3);//false
	
	System.out.println("-----------------");
	String s4 = new String("Hello");
	String s5 = new String("Hello");
	String s6 = new String("surendra");

	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);	

    System.out.println(s4==s5);//  ??  
	System.out.println(s4==s6);//??
	System.out.println("------using equals method-----");
	
		System.out.println(s4.equals(s5));//??
		System.out.println(s4.equals(s6));//??

	
	
	
		
	
	}//main
}//class