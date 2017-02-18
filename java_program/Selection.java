/*THIS IS PROGRAM OF SWITCH
	DETAILED DESCRIPTION OF JAVA ,JAVAP,
	AND JAVAC COMMOND
AUTHOR = MANOJ CHAURASIYA
DATE 28 TH JANUARY
RAIPUR INDIA
*/

class Selection
{
	public static void main(String []a)
	{ 
		java.util.Scanner scan;
		scan = new java.util.Scanner(System.in);
		System.out.println("============================================================================");
		System.out.println("Enter the option number for appropriate Descriptin of given option");
		System.out.println("1-JAVA");
		System.out.println("2-JAVAC");
		System.out.println("3-JAVAP");
		int javaOptins = scan.nextInt();
	switch(javaOptins)
		{
			case 1 :
				System.out.println("-JAVA is used for running java file which is made by jvm");
				System.out.println("Syntax = java filename");
				System.out.println("Example = java Selection");
			break;
			
			case 2 :
				System.out.println("-JAVAC is used for Compiling java file which is made by Programmer");
				System.out.println("Syntax = javac filename.java");
				System.out.println("Example = java Selection.java");
			break;
			
			case 3 :
				System.out.println("-JAVAP is used for checking what is inside in the class");
				System.out.println("Syntax = javap Package.ClassName");
				System.out.println("Example = javap Package.Scanner");
			break;	
			
			case 4 :
				System.out.println("Invalid option");
			break;	
		}
		System.out.println("============================================================================");
	}
}