
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

/*
for each loop 4th in java

for(DataType var : collectionsOfData )
 
*/
/*
var args new features in jdk 1.5

method(type ... args){}
method(10);
method(10,40,40,40);


*/

class CMD2{
	//public static void  main(String []args){
	public static void  main(String ... args){
		System.out.println(args.length);
//1.5
for(String str : args){
   System.out.println(str);
}
		
	}//main

}//class