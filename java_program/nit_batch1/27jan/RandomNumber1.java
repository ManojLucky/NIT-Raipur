//import java.util.Scanner; 

class  RandomNumber1{

 public static void  main(String args[]){
   /*
	for(int n=1;n<=10 ;n++){
		//System.out.println(Math.random());
		//System.out.println(Math.random()*10);
		System.out.println((int)(Math.random()*10));
		 
	 }
 */
 

for(int r=101;r<=110 ;r++){
      for(int c=301;c<=310 ;c++){
		  int num = (int)(Math.random()*100);
		  System.out.printf("%-4d", num);
		 }
		 System.out.println();//for new line
		 
	 }//row

 
	}//main
}//class




