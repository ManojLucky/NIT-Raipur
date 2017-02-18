/*THIS IS PROGRAM OF CHARACTER DATA TYPE 
DEMONSTRATION
AUTHOR=MANOJ CHAURASIYA
DATE=28 TH JANUARY
RAIPUR INDIA
*/
class CharExampl
{
	public static void main(String []ag)
	{
		java.util.Scanner scan;
		scan = new java.util.Scanner(System.in);
	    System.out.println("=============================================================");
		System.out.print("Enter your Gender M->Male or F->Female=");
		char gender = scan.next().charAt(0);
		if( gender =='M' || gender =='m')
			{
				System.out.println("You are male");
			}
		if( gender =='F' || gender =='f')
			{
				System.out.println("You are Female");
			}
			System.out.println("=========================================================");
		
	}
}
