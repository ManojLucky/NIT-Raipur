 

class  DemoChar{

 public static void  main(String args[]){
	
  java.util.Scanner scan;
  //System.in keyboard 
  scan= new java.util.Scanner(System.in);
     
  System.out.print("Enter your gender:M/F"); 
  /*String str  = scan.next();//string 
  char gender  = str.charAt(0);
  */
  //==
  
  char gender  = scan.next().charAt(0);
  
  if(gender=='M' ||gender=='m' ){
      System.out.println("you are male");
  }else if(gender=='F' ||gender=='f' ){
      System.out.println("you are female");
  }else{
      System.out.println("other type");
  }
   
	}//main
}//class




