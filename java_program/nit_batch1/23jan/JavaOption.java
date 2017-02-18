import java.util.Scanner; 

class  JavaOption{

 public static void  main(String args[]){
      System.out.println("java options");
     
      System.out.println("for details type");
      System.out.println("1: java");
      System.out.println("2: javac");
      System.out.println("3: javap");
     
	  Scanner scan = new Scanner(System.in);
	  int javaOption = scan.nextInt();
	  
	  switch(javaOption){
		 
		 case 1:
		   System.out.println("java use to run java program ");
		 break;
		
		 case 2:
		    System.out.println("it will compile java files");
		    System.out.println("javac FileName.java");
		    System.out.println("javac *.java");
		  break;
		   
		  case 3:
		    System.out.println("what inside class ");
		    System.out.println("javap package.ClassName");
		   break;
		 //case3 end  
		  default:
			System.out.println("invalid option");
			break;
	  
	  }
	  
	  
	  
   
   
	}//main
}//class




