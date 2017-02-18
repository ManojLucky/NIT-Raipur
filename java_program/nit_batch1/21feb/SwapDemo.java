
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  SwapDemo{
	public static void  main(String args[]){
		
		//cal by value
		int a=10; 
		int b=20;
		
		SwapTool st  = new SwapTool();
		System.out.println("before swap" +a +"," +b);//10,20
		st.swap(a,b);
		System.out.println("after swap" +a +"," +b);//10,20
		
		System.out.println("-------------cal by ref");
		
		  MyData md = new MyData();
		  md.i=10;
		  md.j=20;
		  System.out.println("before swap");
		  md.show();//10,20
		  st.swap(md);
		  System.out.println("after swap");
		  md.show();//20,10
		 
		  
		  
		
	}//main

}//class