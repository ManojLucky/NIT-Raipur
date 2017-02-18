/* This is the program of showing character
	in heirarical order if they are in small case then convert in 
	upper case and vice-versa
Author = Manoj chaurasiya
Email = manojlucky.214@gmail.com
Monday 29 February 2016 09:58:47 PM IST 
Raipur (India)
*/

class heirarchi 
{
	public static void main(String []args)
	{
		char []name = {'M','a','N','o','j','c','H','a','R','a','S','i','y','A'};
		for(int r=1;r<=name.length;r++)
		{
			for(int c=1;c<=r;c++)
			{
				char ch = name[r-1];
				if(ch>='a' && ch<='z')
					{
						ch = (char)((int)ch-32);
					}
				else if(ch>='A' && ch<='Z')
					{	
						ch = (char)((int)ch+32);
					} 
				System.out.print(ch);
			}
			System.out.println("");
		}	
			
	}
}
