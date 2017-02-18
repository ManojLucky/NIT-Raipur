
public class SisCalc {
  
	public static void main(String[] args) {

	System.out.println("main start");
		String numStr1;
		String numStr2;
		
		int num1;
		int num2;
		int sum;
		int div;
		//
		numStr1 = args[0];//ArrayIndexOutOfBoundsException
		numStr2 = args[1];//ArrayIndexOutOfBoundsException
		//convert
		num1 = Integer.parseInt(numStr1);//java.lang.NumberFormatException
		num2 = Integer.parseInt(numStr2);//java.lang.NumberFormatException
		
		//process
		sum=num1+num2;
		div=num1/num2;//ArithmeticException
		
		System.out.println("sum of " + num1 +"+" + num2+" = " +sum);
		System.out.println("div of " + num1 +"/" + num2+" = " +div);
		
		
		

	System.out.println("main End");
		
	}
	
}