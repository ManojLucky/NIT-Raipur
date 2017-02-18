/*THIS PROGRAM IS ABOUT TO TAKING INPUT 
  FROM KEYBOARD
 AUTHOR=MANOJ CHAURASIYA
 DATE=REPUBLIC DAY SPECIAL
 RAIPUR INDIA
 */
 class keyInput
 {
	public static void main(String []arg)
	{
	//For Keyboard input
		java.util.Scanner scan;
		scan= new java.util.Scanner(System.in);
		System.out.println("Enter your info");
	//variable declaration	
		String name;
		byte age;
		String gender;
		double salary;
	//Reading from keyboard and assigne to variable
		System.out.print("\t Enter your name=");
		name = scan.nextLine();
		System.out.print("\tEnter your Age=");
		age = scan.nextByte();
		System.out.print("\tEnter your Gender=");
		gender = scan.next();	
		System.out.print("\t Enter your Salary=");
		salary = scan.nextDouble();
	//showing the result
		System.out.println("=======================================Entered information================================");
		System.out.println("Entered Name is = " + name);
		System.out.println("His age is = " + age);
		System.out.println("His gender is = " + gender);
		System.out.println("His salary is = " + salary);
		
	}
 }