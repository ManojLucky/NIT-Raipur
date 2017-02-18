
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  Class2{
	public static void  main(String args[]){
		System.out.println("Class2");   
		args=new String  [] {"sis","success is sure","Surendra IT Solution"};
		 // Class1.main(args);// static ok
		 
		 Class1 c  = new Class1();
		 c.main(args);
		 c.main(new int[]{11,22,33});
		 
		
	}//main

}//class