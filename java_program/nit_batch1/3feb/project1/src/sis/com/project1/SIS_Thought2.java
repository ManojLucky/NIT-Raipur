package sis.com.project1;
/* 
auther: surendra kuamr  sao
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

class  SIS_Thought2{
	public static void  main(String args[])throws Exception{

     String [] thoughts={
	 "thought1",
	 "thought2",
	 "thought33",
	 "thought3",
	 "thought4",
	 "thought5",
	 };

	for(int t=1;t<=thoughts.length;t++){
		Thread.sleep(1000);
		System.out.println(thoughts[t-1]);   
	}


	}//main

}//class