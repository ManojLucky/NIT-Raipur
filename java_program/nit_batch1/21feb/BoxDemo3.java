
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  BoxDemo3{
	public static void  main(String args[]){
		
	Box b1  = new Box();//10/20/30
	System.out.println("-------------box1----------");
	 b1.showDetails();
			
	
Box b2  = new Box(10f);
	System.out.println("-------------box2----------");
	 b2.showDetails();
	
Box b3  = new Box(10f,44f,66f);
	System.out.println("-------------box3----------");
	 b3.showDetails();
	
	
	}//main

}//class