
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  PersonDemo{
	public static void  main(String args[]){
		
		Person p1  = null;
		System.out.println("total " + Person.getTotalPopulation());//0
		
		
		
		p1  = new Person();
		System.out.println("total " + p1.getTotalPopulation());
		Person p2  = new Person();
		System.out.println("total " + p2.getTotalPopulation());
		
		
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();
		
			Person [] arr ={
			
			new Person(),
			new Person(),
			new Person(),
			new Person(),
			new Person(),
			new Person(),
			};
			
		System.out.println("total " + Person.getTotalPopulation());//0
		
	}//main

}//class