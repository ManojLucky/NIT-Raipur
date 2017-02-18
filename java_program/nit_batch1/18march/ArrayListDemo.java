import java.util.ArrayList;
import java.util.Date;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList names = null;

		System.out.println(names);
		names = new ArrayList();
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		System.out.println("-------------");
		
		names.add("rahul");
		names.add("abhishek");
		names.add("abhishek");
		names.add("abhishek1");
		names.add("abhishek2");
		names.add("abhishek3");
		names.add(100);
		names.add(new Date());
		
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
			System.out.println(names.get(i));
			
		}
		
		
	}

}
