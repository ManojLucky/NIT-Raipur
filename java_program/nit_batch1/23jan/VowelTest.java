import java.util.Scanner; 

class  VowelTest {

 public static void  main(String args[]){
      System.out.println("enter your char a-z A-Z");
 	  Scanner scan = new Scanner(System.in);
	  char alphabet = scan.next().charAt(0);
	  
	  switch(alphabet){
		/*case 'a':
		   System.out.println("Vowel");
		 case 'e':
		   System.out.println("Vowel");
		 case 'i':
		   System.out.println("Vowel");
		 case 'o':
		   System.out.println("Vowel");
		 case 'u':
		   System.out.println("Vowel");
		 
		   */
		   /*
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
		   System.out.println("Vowel");
		 */
		   
	case 'a': case 'e':  case 'i': case 'o': case 'u':
	case 'A': case 'E':  case 'I': case 'O': case 'U':
	//case 65 :// duplicate case label
		   System.out.println("Vowel");
		   
		   
	  }//switch end
	  
	}//main
}//class




