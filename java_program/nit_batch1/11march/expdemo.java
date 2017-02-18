
public class ExpDemo{
  
	public static void main(String[] args) {
	
		String str  =" surendra it solution";
		//str = null;
		//str = "sis";
		str = null;
		
		try{
		str = str.trim();	
		str  = str.toUpperCase();
		char firstChar  = str.charAt(53);
		System.out.println(str);
		System.out.println(firstChar);
		}catch(NullPointerException e){
			System.out.println("string must not empty /null");
			System.out.println("Error Message" + e.getMessage());
			//for programmer
			e.printStackTrace();
			
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("out of range");
			System.out.println("Error Message" + e.getMessage());
			//for programmer
			e.printStackTrace();
		}
		
	}
}