import java.util.Scanner;
class  AutoBoxing{
			
 public static void  main(String[] args){
  
     int a  = 10;
     Integer objNum1  = new Integer(100);
   System.out.println(a);//10
   System.out.println(objNum1);//100
   int b  = objNum1;//object to primitive
   System.out.println(b);//100
	
    Integer obj2  = b;	
   System.out.println(obj2);//1006
 }//main
}//class



