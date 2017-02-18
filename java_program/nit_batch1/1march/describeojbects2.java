
public class DescribeOjbects2 {

 
	public static void main(String[] args) {

      //=================================
       Object o  = new Object();
	   Human h  = new Human();
       Student   s = new Student();
        Trainer t  = new Trainer();
       
      
       describe(o); 
	   System.out.println("************************************");
       describe(h);
	   System.out.println("************************************");
       describe(s);
	   System.out.println("************************************");
       describe(t);
	      
	}
	
	public static void describe(Object obj){
	   
	   if(obj instanceof Object){
	        System.out.println(obj  + " is Object");
	   }
	
	if(obj instanceof Human){
	        System.out.println(obj  + " is Human");
	   }
	 
	
	if(obj instanceof Student){
	        System.out.println(obj  + " is Student");
	 }
	   
 if(obj instanceof Trainer){
	        System.out.println(obj  + " is Trainer");
	   }
	
	
	}
	

}
