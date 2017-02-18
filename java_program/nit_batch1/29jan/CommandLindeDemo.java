

class  CommandLindeDemo{

 public static void  main(String args[]){
    System.out.println(args.length);//
    
	if(args.length>=1){
	   System.out.println("welcome" +args[0]);//
	}
 
    System.out.println("you have pass following string");//
 for(int cmd=1;cmd<=args.length;cmd++){
    System.out.println(args[cmd-1]);//
 }
   
 }//main
}//class


