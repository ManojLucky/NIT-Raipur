
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

/**
 * @author Surendra
 *Mar 13, 2016
 * 
 */
public class FinallyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s=null;
		
			s="ABC";
			
			try {
				s.charAt(1);
			} catch (Exception e) {
				e.printStackTrace();;;;;;;;;;;;;;
			}finally{
				s=null;
				System.out.println("last : " +s);//null
			}
		
		
		
		
	}

}
