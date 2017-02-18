
public class SisCalc4{
  
	public static void main(String[] args) {

	System.out.println("main start");
		String numStr1=null;
		String numStr2=null;
		
		int num1=0;
		int num2=0;
		int sum=0;
		int div=0;

try{		
		numStr1 = args[0];//ArrayIndexOutOfBoundsException
		numStr2 = args[1];//ArrayIndexOutOfBoundsException
		num1 = Integer.parseInt(numStr1);//java.lang.NumberFormatException
		num2 = Integer.parseInt(numStr2);//java.lang.NumberFormatException
		sum=num1+num2;
		div=num1/num2;//ArithmeticException
		
		System.out.println("sum of " + num1 +"+" + num2+" = " +sum);
		System.out.println("div of " + num1 +"/" + num2+" = " +div);
		
	}catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("plz provide 2 numbers");
	}catch(NumberFormatException e){
		System.out.println("both number must be integer");
	}catch(ArithmeticException e){
	   System.out.println("2nd must not be zero");
	}	
		
		
	System.out.println("main End");
		
	}
	
}