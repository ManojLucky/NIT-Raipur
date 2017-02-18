

class  Game2{

 public static void  main(String args[]){

  java.util.Random random1 = new java.util.Random();
 /*
 automatedluckNumber variable will store automated 
 generated number for comparing user luck number
 */
 int automatedluckNumber = random1.nextInt(10);
 
 
 java.util.Scanner scan = new java.util.Scanner(System.in);
 
  boolean isWin = false;
 
 
	for(int totalChance=1;totalChance<=3;totalChance++ ){
	   
     System.out.println( "user enter your Luck Number");
     int userLuckNumber = scan.nextInt();
	 
	   if(automatedluckNumber==userLuckNumber){
		 isWin=true;
		 break;
		}//end if
	 }//end for
     System.out.println( "Luck Number" +automatedluckNumber);
  
     String msg  = isWin==true ? "you Win": " Try again for better luck";
     System.out.println( msg);
		 
  
	}//main
}//class




