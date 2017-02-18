
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  PersonDemo{
	public static void  main(String args[]){
		
		Person p1  = new Person();
		System.out.println("-----------------------");
		p1.showDetails();
		
	  p1.setName("rahul");
	  p1.setColor("fair");
	  p1.setGender('M');
	  p1.setAge(20);
	  p1.setTotalFingers(20);
	  p1.setTotalEyes(2);
	  
	System.out.println("-----------------------");
		p1.showDetails();
		
		
	}//main

}//class