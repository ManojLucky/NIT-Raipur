/*This program is about to getting system enviorment
Author = Manoj chaurasiya
Date Repbulic day special 
Raipur India
*/
class  Enviorment
{
	public static void main (String []args)
	{
		System.out.println("Program of getting system Enviorment");
		System.out.println("================================================");
		System.out.print("User name of this computer=");
		System.out.println(System.getenv("username"));
		System.out.print("NUMBER OF PROCESSORS="); 
		System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
		System.out.print("OS Name=");
		System.out.println(System.getenv("OS"));
		System.out.print("COMPUTER NAME=");
		System.out.println(System.getenv("COMPUTERNAME"));
		System.out.println("================================================");
	} //End of main
} //End of class