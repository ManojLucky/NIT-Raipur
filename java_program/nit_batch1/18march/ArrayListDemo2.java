import java.util.ArrayList;
import java.util.Date;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> names = null;

		System.out.println(names);
		names = new ArrayList<String>();
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		System.out.println("-------------");
		
		names.add("rahul");
		names.add("abhishek");
		names.add("100");
		//names.add(100);
		//names.add(new Date());
		
		System.out.println(names);//
		System.out.println(names.size());//2
		System.out.println(names.isEmpty());//false
		System.out.println("-------------");
	
		/*names.remove(0);
		names.remove(0);
		names.remove(0);
		System.out.println(names);//
			
*/		
		for (int i = 0; i < names.size(); i++) {
			String str  =names.get(i);
			System.out.println(str.toUpperCase());
			
			
			
		}
		
		
	}

}
