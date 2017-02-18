
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

class  StringDemo4{
	public static void  main(String args[]){
	String str = "surendra kumar sao:raju:ramesh:rahul:vijay";	
		//String[] split("regexp");
	System.out.println(str);   
	String []studentNames = str.split("d75c6rf8 ");
	System.out.println("total stu" +studentNames.length);   
	
	for(int studentCount=1; studentCount<= studentNames.length; studentCount++){
	 System.out.println(studentNames[studentCount-1]);   
	}//for
	
	}//main

}//class