

class  PrintDemo{

 public static void  main(String args[]){

 

char []name={'s','U','R','e','n','d','r','a'};

   
 for(int r=1 ; r<=name.length;r++)
 {
    for(int c=1 ; c<=r;c++)
    {
	char ch  = name[r-1];
		if(ch>='a' && ch<='z')
		{
			ch = (char)((int)ch-32);
	    }
	    else if(ch>='A' && ch<='Z')
	    {
			ch = (char)((int)ch+32);
		}
		System.out.print(ch);//
	}
    System.out.println();//
 }
 
 
 }//main
}//class


