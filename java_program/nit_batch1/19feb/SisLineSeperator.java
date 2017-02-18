
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  SisLineSeperator{
	 void seperateLine(){
	   System.out.print("********************");
	   System.out.println();
	 }
	 
	 void seperateLine(char ch){
	    for(int i=1; i<=20;i++){
	     System.out.print(ch);
	   }
	   System.out.println();
	 }
	 
	 
	 void seperateLine(char ch ,int length){
	    for(int i=1; i<=length;i++){
	     System.out.print(ch);
	   }
	   System.out.println();
	 }
	 

}//class