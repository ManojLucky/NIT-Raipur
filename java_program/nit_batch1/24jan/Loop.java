import java.util.Scanner; 

class  Loop{

 public static void  main(String args[]){
     
	 int i=1;
	 final int MAX =10;
	 
	 while(i<=MAX){
	   System.out.print(i++);
	   System.out.print(i<=10 ? " ,": "");
	  }//end while
	  
	   System.out.print("\n=============\n");
	  
	  for(int number=1 ;number<=MAX; number++){
	   System.out.print(number);
	  }
	  /*
	  do{
	  
	  }while(be);otepa
	  */
	  //
	   System.out.print("\n=============\n");
	  i=1;
	  do{
	   System.out.print(i++);
	   System.out.print(i<=10 ? " ,": "");
	  }while(i<=MAX);
	  
	  
	   System.out.print("\n=============\n");
	  
	  int number=1 ;
	  for(;number<=MAX; ){
	   System.out.print(number);
	   System.out.print(number<10 ? " ,": "");
	   number++;
	  }
	  
	}//main
}//class




