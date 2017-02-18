
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
public class VoterSytemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Person [] voters ={
				new Person("raj",22),
				new Person(null,22),
				new Person("raj",17),
				new Person("ra",18),
				null,
				};
		
		
		for (Person person : voters) {
			try {
				boolean isVoteSuccess = VoterSystem.vote(person);
				System.out.println(person+ "success vote ??" + person);

			} catch (PersonNotFoundException e) {
				System.out.println("Errors  : " + e.getMessage());
			} catch (VoterAgeExption e) {
				System.out.println("Errors Age : " + e.getMessage());
				
			} catch (InvalidNameLengthExeption e) {
				System.out.println("Errors name Legth : " + e.getMessage());
				
			} catch (VoterNameExeption e) {
				System.out.println("Errors name : " + e.getMessage());
				
			} catch (Exception e) {
				System.out.println("Generic Error" + e.getMessage());
			}
		}
		
		
		System.out.println("completed");

	}

}
