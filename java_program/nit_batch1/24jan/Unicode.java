import java.util.Scanner; 

class  Unicode{

 public static void  main(String args[]){
	char ch = 'A';
   	System.out.println(ch);//A
	
	ch = '\u0950';
   	System.out.println(ch);//om in hindi
	String msg = "I Like " + ch;
   	javax.swing.JOptionPane.showMessageDialog(null,msg);
	
	String ucodes= "";
	ucodes = ucodes+"\u0950"+"\n";
	ucodes = ucodes+"\u0951"+"\n";
	ucodes = ucodes+"\u0952"+"\n";
	ucodes = ucodes+"\u0953"+"\n";
	ucodes = ucodes+"\u0954"+"\n";
	ucodes = ucodes+"\u0955"+"\n";
	ucodes = ucodes+"\u0956"+"\n";
	ucodes = ucodes+"\u0957"+"\n";
	ucodes = ucodes+"\u0958"+"\n";
	ucodes = ucodes+"\u0959"+"\n";
	ucodes = ucodes+"\u0960"+"\n";
	ucodes = ucodes+"\u0961"+"\n";
	ucodes = ucodes+"\u0962"+"\n";
	ucodes = ucodes+"\u0963"+"\n";
	ucodes = ucodes+"\u0964"+"\n";
	ucodes = ucodes+"\u0965"+"\n";
	ucodes = ucodes+"\u0966"+"\n";
	
	 javax.swing.JOptionPane.showMessageDialog(null, ucodes);
	}//main
}//class




