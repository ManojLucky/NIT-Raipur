
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  XDemo{
	public static void  main(String args[]){
		    //create object
			X obj = new X();
			
			int  i =10;
			float f=10.5f;
			String s ="sis";
			obj.m1(s);
			
			obj.m1(i);
			obj.m1(f);
			
			/*double d =100.5;
			obj.m1(d);
			*/
			byte b=10;
			obj.m1(b);
			
			//obj.m1('A','B'); ERROR
			long l=10;
			obj.m1(l);
			obj.m1('A');
			
			
			
	}//main

}//class



