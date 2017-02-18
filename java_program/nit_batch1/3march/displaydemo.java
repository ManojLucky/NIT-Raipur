
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
public class DisplayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {

         String className = args[0];
         //load
         Class c = Class.forName(className);
         Object obj = c.newInstance();
         System.out.println(obj);
         
         //check DisplayMsg
         if(obj instanceof DisplayMsg){
        	 //DisplayMsg msgObj  = obj; 
        	 DisplayMsg msgObj  = (DisplayMsg)obj;
        	 msgObj.input();
        	 msgObj.show();
         }
         
         //human object
         
         if(obj instanceof Human){
        	 Human humanRef =(Human) obj;
        	 humanRef.run();
        	 humanRef.walk();
        	 
        	 
         }

	}

}
