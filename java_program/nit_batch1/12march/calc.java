
/** 
SIS: Surendra IT Solution
Auther: Surendra Kumar  Sao
S/W Architech & Corporate s/w Trainer
Exp. +7.5Yr in Sw Development.
+28 projects exp. from scratch.
Java Certified :  SCJP(98%)  & SCWCD(98%)
MCA from NIT Raipur
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G) India

*/

public class  Calc{
	public static Float div(Integer a, Integer b)throws NullPointerException,
						ArithmeticException{
	
	if(a==null || b==null){
	 throw new NullPointerException("nuber required ");
	}
	
	if(a<0 || b<0){
	 throw new ArithmeticException("required +ve number");
	}
	
	
	if(b==0){
	 throw new ArithmeticException("2nd number must not be Zero");
	}
	
	return (float)a/b;
	}
	
	
	
	
}//class