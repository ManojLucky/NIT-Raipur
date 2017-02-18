
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/
/*
javap java.lang.System{
 long currentTimeMillis();
 long nanoTime();

}
*/

public class Testing{
	public static void  main(String args[]){
	 //long startTime = System.currentTimeMillis();
	 long startTime = System.nanoTime();
	
		//for(int i=1;i<=1000;i++){		
		for(int i=1;i<=3;i++){		
		  System.out.println("SIS_" + i);
		}		
	 //long endTime = System.currentTimeMillis();
	 long endTime = System.nanoTime();
	 System.out.println("total Time :" + (endTime-startTime));
	}//main
}//class
