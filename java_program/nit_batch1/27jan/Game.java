

class  Game{

 public static void  main(String args[]){

  java.util.Random random1 = new java.util.Random();
 /*
 automatedluckNumber variable will store automated 
 generated number for comparing user luck number
 */
 int automatedluckNumber = random1.nextInt(10);
 
  boolean isWin = false;
 
     System.out.println( "Luck Number" +automatedluckNumber);
 
	for(int totalChance=1;totalChance<=3;totalChance++ ){
	   int userLuckNumber = random1.nextInt(10);
     System.out.println( "user Luck Number" +userLuckNumber);
	     if(automatedluckNumber==userLuckNumber){
		 isWin=true;
		 break;
		}//end if
	 }//end for
  
     String msg  = isWin==true ? "you Win": " Try again for better luck";
     System.out.println( msg);
		 
  
	}//main
}//class




