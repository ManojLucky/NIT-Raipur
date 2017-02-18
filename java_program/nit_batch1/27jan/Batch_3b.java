

class  Batch_3b{

 public static void  main(String args[]){

 //declare array
 String []studentNames;
 studentNames = null;
 System.out.println(studentNames);//null
		 
//create array object
  studentNames = new String[5];
 System.out.println(studentNames);//??
 
 //show
 for(int p=1 ; p<=studentNames.length;p++){
   System.out.println(studentNames[p-1]);//
 }
 //studentNames[0] = "raju";
 //studentNames[1] = "ram";
 //fill
 for(int p=1 ; p<=studentNames.length;p++){
  studentNames[p-1]  = "SName_"+ p;//
 }
   	
//show
   System.out.println("-----------");//
for(int p=1 ; p<=studentNames.length;p++){
   System.out.println(studentNames[p-1]);//
 }
 //	
  
	}//main
}//class







//studentNames


