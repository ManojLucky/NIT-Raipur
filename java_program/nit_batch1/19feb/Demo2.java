
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  Demo2{
	public static void  main(String args[]){
		OverlaodDemo1 ref = new OverlaodDemo1();
		SisLineSeperator ls = new SisLineSeperator();
		ls.seperateLine();
		ref.show(10,10f);
		ls.seperateLine('-');
		ref.show(10f,10);
		ls.seperateLine('$');
		ref.show(170f,1110);
		ls.seperateLine('*' ,15);
		System.out.println("******");
		
	}//main

}//class