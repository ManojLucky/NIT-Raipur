

class  Batch_3{

 public static void  main(String args[]){

 //declare array
 String []studentNames;
 studentNames = null;
 System.out.println(studentNames);//null
		 
//create array object
  studentNames = new String[15];
 System.out.println(studentNames);//?? address
 
 //show
 for(int p=1 ; p<=15;p++){
   System.out.println(studentNames[p-1]);// 15 times Null
 }
 //studentNames[0] = "raju";
 //studentNames[1] = "ram";
 //fill
 for(int p=1 ; p<=15;p++){
  studentNames[p-1]  = "SName_"+ p;// setting up the value
 }
   	
//show
   System.out.println("-----------");// showing the setted value 
for(int p=1 ; p<=15;p++){
   System.out.println(studentNames[p-1]);//
 }
 //	
  
	}//main
}//class







//studentNames


