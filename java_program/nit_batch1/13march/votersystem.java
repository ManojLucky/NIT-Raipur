
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
public class VoterSystem {

	public static boolean vote(Person person)
	throws PersonNotFoundException,
	VoterAgeExption,InvalidNameLengthExeption,VoterNameExeption{
		boolean isSuccessFull=false;
		
		if(person==null){
			//throw new NullPointerException("Peron not present");
			throw new PersonNotFoundException("Peron not present");
			
		}
		
		if(person.name==null || person.name.trim().isEmpty()){
			throw new VoterNameExeption("name not found");
		}
		
		if(person.name.trim().length()<3){
			throw new InvalidNameLengthExeption("name length Error");
		}
		
		if(person.age<18){
			throw new VoterAgeExption("not adult person");
			
		}
		
		
		
		
		
		
		isSuccessFull=true;
		
		return isSuccessFull;
	} 
	
}
