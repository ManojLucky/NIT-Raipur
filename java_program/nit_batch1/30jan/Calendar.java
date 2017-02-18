class Calendar{

 public static void  main(String args[]){
 
  String []weekDayNames={
		"SUN","MON","TUE","WED","THU","FRI","SAT"
	};
 
 for(int weekDay=1 ;weekDay<=weekDayNames.length;weekDay++){
  System.out.printf("%-5s",weekDayNames[weekDay-1] +" ");
 
 }
    int totalWeeks = 5;
    int totalWeekDays = 7;
   /*Integer [][] janMonth = null; 
   janMonth = new Integer[totalWeeks][totalWeekDays];
   */
   
   Integer [][] janMonth={
	   {31, null, null,null,null,1,2},
	   {3,4,5,6,7,8,9},
	   {10,11,12,13,14,15,16},
	   {17,18,19,20,21,22,23},
	   {24,25,26,27,28,29,30},
   };
   
  System.out.println();
 
 
 for(int week=1;week<=totalWeeks; week++){
  for(int weekDays=1;weekDays<=totalWeekDays; weekDays++){
  
     String numStr = janMonth[week-1][weekDays-1]==null?"-" :janMonth[week-1][weekDays-1]+"";
    System.out.printf("%-5s",numStr);
    //System.out.printf("%5d",janMonth[week-1][weekDays-1]);
  }
 System.out.println();
 }
 System.out.println();
  
	}//main
}//class
