/*This is program of 
	Reading book by page wise
Author=Manoj chaurasiya
Date=27th jan
Raipur india
*/ 
import java.util.Scanner; // OR in main java.util.Scanner scan
class Reading
{
	public static void main(String []a)
	{
		Scanner scan = new Scanner(System.in);
		int Max_Page = 100;
		int Min_Page = 1;
		int counter = Min_Page;
		boolean ReadAnswer; 
		do
		{
			System.out.println("=============================Manoj===================================");
			System.out.println("Do you want Read the Book");
			ReadAnswer = scan.nextBoolean();
			if(!ReadAnswer)
			{
				System.out.println("Nothing to be Readed ");
				break;
			}
				while(counter<=Max_Page)
				{
					System.out.println(" Page " + counter + " Readed ");
					System.out.println("Do you want to continue to Reading ");
					boolean ReadAnswer1 = scan.nextBoolean();
					if(!ReadAnswer1)
					{
					break;
					}
					counter++;
				} //End While
			
		}while(ReadAnswer=false);
		System.out.println("=============================Manoj===================================");
	} // End Main

} //End class
