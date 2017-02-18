
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

class  ArrayDemo{
	public static void  main(String args[]){
		
		int []arr1=new int[]{22,11,44,88,55,33};
		
		System.out.println(arr1);
		
		boolean []arr2= new boolean[10];
		System.out.println(arr2);
		for(int x : arr1){
		System.out.println(x);
		}
		System.out.println("--------------");
		
		
		for(boolean x : arr2){
		System.out.println(x);
		}
		
		
	}//main

}//class