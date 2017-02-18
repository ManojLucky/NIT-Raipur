
public class RefDemo2 {

 
	public static void main(String[] args) {

       Student s = null;
       s = new Student();
       s.run();
       s.walk();
       s.read();
       s.write();
      //=================================
       
       s  = new Trainer();
       s.run();
       s.walk();
       s.read();
       s.write();
      // s.teach();//The method teach() is undefined for the type Studen

       
       Human h  = new Trainer();
       
       h.run();
       h.walk();
       //h.read();
       //h.write();
       //h.teach();
       
       
       Object obj = null;
       		obj  = new Human();
       		obj.toString();
       	//	obj.run();
       	//	obj.walk();
       
       		obj  = new Student();
           // obj.read();
            ///obj.write();
          	
       		
       		obj  = new Trainer();
       
       		//obj.teach();	
       		
       
       
	}

}
