
/* 
auther: surendra kuamr  sao
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/
import java.io.Console;
class  SisSw2{
	public static void  main(String args[]){

	String user="sis";
	String userPass="sis123";
	
	
	String uID = null;
	String uPass = null;
	//ERROR Console  console = new Console();
	Console  console = System.console();

System.out.println("enter your uid");
uID = console.readLine();
System.out.println("enter your upass");
uPass =   new String (console.readPassword()) ;
	
if( user.equals(uID) && userPass.equals(uPass)){
  System.out.println("Welcome to Surendra IT Solution");
}else{	
  System.out.println("wrong userid/password");
}		

	}//main
}//class