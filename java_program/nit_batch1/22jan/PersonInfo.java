//this is hello world program
/* 
auther: surendra kuamr  
date : 7:23 PM 1/21/2016
Raipur india
*/

class  PersonInfo{

	public static void  main(String args[]){
	
		java.util.Scanner scan;
		//System.in keyboard 
			scan= new java.util.Scanner(System.in);
			System.out.print("Enter your info:"); 
			String name;
			byte age;
			String gender;
			double amount;
		//read from keyboar and assign to variable
			System.out.println("enter your name ");
		//name = scan.next();
			name = scan.nextLine();
			System.out.println("enter your age ");
			age = scan.nextByte();
			System.out.println("enter your gender male/female ");
			gender = scan.next();//male or female
			System.out.println("enter your amount ");
		//amount = scan.nextFloat();
			amount = scan.nextDouble();
		System.out.println("-----------info entered----------"); 
		System.out.println("Name "+ name ); 
		System.out.println("Age "+ age ); 
		System.out.println("Gender "+ gender ); 
		System.out.println("amount "+ amount ); 
		
  }//main
}//class




