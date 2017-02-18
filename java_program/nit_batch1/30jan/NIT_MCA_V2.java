import java.util.Scanner;

class NIT_MCA_V2{

 public static void  main(String args[]){
 
    String [][] nit_MCA_StudentNames = null;
	
 System.out.println("enter total sem");

 int totalSem = new Scanner(System.in).nextInt();
 
 nit_MCA_StudentNames = new String[totalSem][];//2 sem
 

  for(int sem=1; sem<=nit_MCA_StudentNames.length;sem++){
      System.out.println("enter total student for " + sem);
      int totalStudentSize  = new Scanner(System.in).nextInt();
	  nit_MCA_StudentNames[sem-1] = new String[totalStudentSize];
    }


  
        System.out.println("------------");
		
		
  for(int sem=1; sem<=nit_MCA_StudentNames.length;sem++){

        System.out.println("total Studnets in Sem " + sem +" = " + nit_MCA_StudentNames[sem-1].length);
    }

		
		
        System.out.println("------------");
  
  for(int sem=1; sem<=nit_MCA_StudentNames.length;sem++){
		for(int stu=1; stu<=nit_MCA_StudentNames[sem-1].length;stu++){
        System.out.printf("%5s",nit_MCA_StudentNames[sem-1][stu-1]);//2
    }
        System.out.println();
	}

  
	}//main
}//class
