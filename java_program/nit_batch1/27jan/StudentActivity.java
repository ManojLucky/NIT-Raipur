import java.util.Scanner; 

class  StudentActivity {

 public static void  main(String args[]){
      System.out.println("");
 	  Scanner scan = new Scanner(System.in);
	 //init 
	 final int MIN_PAGE = 1;
	 final int MAX_PAGE = 100;
	 int counter = MIN_PAGE;
	 
	 while(counter<=MAX_PAGE){  //condition
	 
	  System.out.println("page"+ counter +"readed");
      System.out.println("do you want to read next page??");
      System.out.println("true read /false no read");
	   boolean readOption = scan.nextBoolean();
	   if(!readOption){
		  break;
	   }//end if
	   
 	  counter++;
	  
	  }//end while
	  
	  
	}//main
}//class




