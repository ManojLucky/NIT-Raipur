
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
java CMD *

java CMD *.java *.class *.txt
*/

class CMD{
	public static void  main(String []args){
		System.out.println(args.length);
	/*
	for(int i=0; i<args.length;i++){
	   String str = args[i];
		System.out.println(str);
	}
*/
//1.5
for(String str : args){
   System.out.println(str);
}
		
	}//main

}//class