
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  Flow{

int a =10;
static int b =10;



static{
    System.out.println("static block");
}//end  of static block


//start of non static block
{
    System.out.println("non static block");
}//end of non static block

Flow(){
System.out.println("constructor");

}

 void m0(){
}
 void m1(){
     //we can use static & non static
	 m0();
	 m2();
	System.out.println(a);
	System.out.println(b);
 }

 
 static void m2(){
     //we can not use  non static
   /* m0();
	 m1();
	 System.out.println(a);
	*/
	System.out.println(b);
 
 }






}//class