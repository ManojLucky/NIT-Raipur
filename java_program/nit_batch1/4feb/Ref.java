
/* 
auther: surendra kuamr  sao
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

class  Ref{
	public static void  main(String args[]){

int a =10;
int b =10;
int c =20;
System.out.println(a==b);//true
System.out.println(a==c);//false


System.out.println("----------------");//false

//create integer object

Integer iObj1 = new Integer(10);
Integer iObj2 = new Integer(20);
Integer iObj3 = new Integer(10);

System.out.println(iObj1==iObj2);//??f
System.out.println(iObj1==iObj3);//??f
	
System.out.println("-------equals---------");//false
System.out.println(iObj1.equals(iObj2));//??f
System.out.println(iObj1.equals(iObj3));//??T
		
	
	}//main
}//class