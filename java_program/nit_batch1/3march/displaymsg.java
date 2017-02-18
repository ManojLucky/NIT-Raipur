import java.util.Scanner;


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
 *Mar 3, 2016
 * 
 */
public abstract class DisplayMsg {
	protected String msg;//GUI/CUI
	//input form kbd
	public void input(){
		System.out.println("enter your msg");
		msg = new Scanner(System.in).nextLine();
	}
	/*
	public void show(){
		System.out.println("your MSG " + msg);
		//GUI
	}
*/
	public abstract void show();
	
	
}
