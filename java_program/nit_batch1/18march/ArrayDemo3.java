import java.util.ArrayList;
import java.util.Scanner;


public class ArrayDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(10));
		numbers.add(10);
		numbers.add(22);
		numbers.add(44);
		System.out.println(numbers.size());
		for (Integer num : numbers) {
			System.out.println(num);
		}
		System.out.println("enter your search number");
		int searchNum= new Scanner(System.in).nextInt();
		boolean isFound = numbers.contains(searchNum);
		System.out.println(isFound?"found": "not found");
		//
		System.out.println(numbers.indexOf(new Integer(searchNum)));
		
		
		
	}
}
