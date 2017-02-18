

class  YearMonths{

 public static void  main(String args[]){

 //declare array
/*
 String []months = new String[12];
 months[0] ="JAN"; 
 months[1] ="FEB"; 
 months[2] ="MAR"; 
 months[3] ="APR"; 
 months[4] ="MAY"; 
 months[5] ="JUN"; 
 months[6] ="JUL"; 
 months[7] ="AUG"; 
 months[8] ="SEP"; 
 months[9] ="OCT"; 
 months[10] ="NOV"; 
 months[11] ="DEC"; 
 */
 String []months = {"JAN","FEB","MAR","APR",
					"MAY", "JUN", "JUL", "AUG", 				   "SEP", "OCT","NOV",  "DEC"} ;
 
 //show
 for(int m=1 ; m<=months.length;m++){
   System.out.println(months[m-1]);//
 }

char []vowelList={'a','e','i','o','u'
,'A','E','I','O','U'};

   System.out.println(vowelList);//

 
 for(int m=1 ; m<=vowelList.length;m++){
   System.out.println(vowelList[m-1]);//
 }
 
 
 }//main
}//class


