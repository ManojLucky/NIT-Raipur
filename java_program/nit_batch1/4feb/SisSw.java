
/* 
auther: surendra kuamr  sao
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/
import java.util.Scanner;
class  SisSw{
	public static void  main(String args[]){

	String user="sis";
	String userPass="sis123";
	Scanner kbd = new Scanner(System.in);
	
	String uID = null;
	String uPass = null;
	
System.out.println("enter your uid");
uID = kbd.nextLine();
System.out.println("enter your upass");
uPass = kbd.nextLine();
	
if( user.equals(uID) && userPass.equals(uPass)){
  System.out.println("Welcome to Surendra IT Solution");
}else{	
  System.out.println("wrong userid/password");
}		
	
	}//main
}//class