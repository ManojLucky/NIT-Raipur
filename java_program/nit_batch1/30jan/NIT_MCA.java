class NIT_MCA{

 public static void  main(String args[]){
 
    String [][] nit_MCA_StudentNames = null;
	
 //nit_MCA_StudentNames = new String[3][92];
 nit_MCA_StudentNames = new String[3][];//2 sem
 
 
  System.out.println(nit_MCA_StudentNames.length);//2

  for(int sem=1; sem<=nit_MCA_StudentNames.length;sem++){
      System.out.println(nit_MCA_StudentNames[sem-1]);//2
    }

	///assing total student size in each sem
	
	nit_MCA_StudentNames[0] = new String[60];
	nit_MCA_StudentNames[1] = new String[81];
	nit_MCA_StudentNames[2] = new String[77];
	
      System.out.println("----------");//2
	
  
  for(int sem=1; sem<=nit_MCA_StudentNames.length;sem++){
      System.out.println(nit_MCA_StudentNames[sem-1].length);//2
    }

  
  
  for(int sem=1; sem<=nit_MCA_StudentNames.length;sem++){
		for(int stu=1; stu<=nit_MCA_StudentNames[sem-1].length;stu++){
        System.out.printf("%5s",nit_MCA_StudentNames[sem-1][stu-1]);//2
    }
        System.out.println();
	}

  
	}//main
}//class
