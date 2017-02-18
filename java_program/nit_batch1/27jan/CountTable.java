import java.util.Scanner; 

class  CountTable{

 public static void  main(String args[]){
/*    
	for(int r=101;r<=110 ;r++){
		for(int c=301;c<=310 ;c++){
		System.out.printf("%3s" ,"+");//for new line
		  }
		System.out.println();//for new line
	 }//row
*/	 

int  rowCounter=1;

for(int r=101;r<=110 ;r++){
    int  colCounter=1;
	
		for(int c=301;c<=310 ;c++){
		  //int num = (colCounter-1)*10 +rowCounter;
		  int num = colCounter*rowCounter;
		  System.out.printf("%-4d", num);
		  colCounter++;
		  }
		  
		System.out.println();//for new line
		rowCounter++;
	 }//row


	}//main
}//class




