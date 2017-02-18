
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  Demo{
	public static void  main(String args[]){
		OverlaodDemo1 ref = new OverlaodDemo1();
		System.out.println("**********************");
		ref.show(10,10f);
		System.out.println("-----------------------");
		ref.show(10f,10);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
		ref.show(170f,1110);
		System.out.println("******");
		
		//ref.show(10f,10f);
		/*Error ref.show(10,10);
		reference to show is ambiguous, both method   show(int,float) in OverlaodDemo1 and method show(float,int) in OverlaodDemo1 match
  ref.show(10,10);
  */
		
		
/*
	System.out.println(10);
	System.out.println(10.0);
	System.out.println("10.0");
	*/	
	}//main

}//class