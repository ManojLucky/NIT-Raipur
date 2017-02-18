/*
sum 
*/
class  SisCal{

 public static void  main(String []args){
  
  if(! (args.length>=2) ){
    System.out.println("required two argument");
    return ;
	//System.exit(0);
  }
  
  String strNum1 = args[0];
  String strNum2 = args[1];
  
  //int num1  = strNum1;
  int num1  = Integer.parseInt(strNum1);
  int num2  = Integer.parseInt(strNum2);
  
  int sum = num1 + num2;
  
  System.out.print("sum of" + num1 + " +" + num2 );
  System.out.println(" = " + sum);
  
	}//main
}//class







//studentNames


