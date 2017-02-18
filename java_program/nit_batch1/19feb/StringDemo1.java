
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  StringDemo1{
	public static void  main(String args[]){
	
	  String s1  ="SIS";
		System.out.println(s1);
		s1.concat("10");
		System.out.println(s1);
		
		System.out.println("--------------------");
		
	  StringBuffer sb  = new StringBuffer("SIS");
	  sb.append("10");
	  System.out.println(sb);

		sb.reverse();
	  System.out.println("reverse");
	  System.out.println(sb);
		
	  StringBuffer sb2  = new StringBuffer("SIS");
	  String str = sb2.toString();
	  sb2.reverse();
		
		
		if(str.equals(sb2.toString())){
		System.out.println("PAl");
		}else{
		System.out.println("not PAl");
		
		}
		
		
	
	
	}//main

}//class