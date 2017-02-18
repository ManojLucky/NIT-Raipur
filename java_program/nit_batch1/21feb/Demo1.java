
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  Demo1{

  public void swap(int a, int b){
    int t =a;
	a=b;
	b=t;
  System.out.println("inside swap" +a +"," +b);
  }





	public static void  main(String args[]){
		
		int i=10;
		int j=20;
		
		
  System.out.println("before swap" +i +"," +j);
  
  Demo1 d  =  new Demo1();
				d.swap(i,j);
  
  System.out.println("after swap" +i +"," +j);
		
	}//main

}//class



