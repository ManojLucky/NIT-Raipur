
/* 
SIS: Surendra IT SOlution
Auther: Surendra Kumar  Sao
S/W Architech & Corporate s/w Trainer
+25 projects exp. from scratch.
Java Certified :  SCJP(98%)  & SCWCD(98%)
MCA from NIT Raipur
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G) India
*/

public class  Box extends Rect{
     float l;
	 
	 /*
	 Box(){
	 super();
	     System.out.println("Child Created");
	 }
	 */
	 
	 Box(float a, float b, float c){
	    //super();
		super(a,b);
	 l=c;
	     System.out.println("Child Created");
	 }
	 
	 
	 public void show(){
	 System.out.println(h);
	 System.out.println(w);
	 System.out.println(l);
	 
	 }
   


}//class