
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/
import java.util.Arrays;

class  ArrayDemo2{
	public static void  main(String args[]){
		
		int []arr1=new int[]{22,11,44,88,55,33};
		
		boolean []arr2= new boolean[10];
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		//sort
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("--------------");
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
			Arrays.fill(arr2,true);
		System.out.println(Arrays.toString(arr2));
		
		
		
		
	}//main

}//class