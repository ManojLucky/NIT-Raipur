import java.util.Scanner; 

class  RandomNumber2{

 public static void  main(String args[]){

  java.util.Random random1 = new java.util.Random();
 
	for(int n=1;n<=10 ;n++){
		//System.out.println(random1.nextInt());
		//
		int  num = random1.nextInt(7);
		System.out.println( num!=0 ? num : "");
	 }
  
 
/*
for(int r=101;r<=110 ;r++){
      for(int c=301;c<=310 ;c++){
		  int num =  (int)(Math.random()*100);
		  System.out.printf("%-4d", num);
		 }
		 System.out.println();//for new line
		 
	 }//row

 */
	}//main
}//class




