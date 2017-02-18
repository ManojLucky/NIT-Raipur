
public class SisCalc2 {
  
	public static void main(String[] args) {

	System.out.println("main start");
		String numStr1;
		String numStr2;
		
		int num1;
		int num2;
		int sum;
		int div;
		//
		try{
		numStr1 = args[0];//ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e){
		   //hadle
		 System.out.println("plz provide first number");
		 return ;
		}
		
		
		//
		try{
		numStr2 = args[1];//ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e){
		   //hadle
		 System.out.println("plz provide 2nd number");
		 return ;
		}
		
		
		//convert
//
		try{
		num1 = Integer.parseInt(numStr1);//java.lang.NumberFormatException
		}catch(NumberFormatException e){
		   //hadle
		 System.out.println("plz provide 1st  number must be int number");
		 return ;
		}

		try{
		num2 = Integer.parseInt(numStr2);//java.lang.NumberFormatException
		}catch(NumberFormatException e){
		   //hadle
		 System.out.println("plz provide 2st  number must be int number");
		 return ;
		}

		
		//process
		sum=num1+num2;
			try{
		div=num1/num2;//ArithmeticException
		}catch(ArithmeticException e){
		   //hadle
		 System.out.println("2nd number must be non zero");
		 return ;
		}
		
		
		System.out.println("sum of " + num1 +"+" + num2+" = " +sum);
		System.out.println("div of " + num1 +"/" + num2+" = " +div);
		
		
		

	System.out.println("main End");
		
	}
	
}