
public class RefDemo {
 
	public static void main(String[] args) {
		
		Parent p  = null;
		/*
		p  = new Parent();
		p.m1();
		p.m2();
		*/

		p = new Child();
		
		p.m1();//p
		p.m2();//c
		//p.m3();
		

	}

}
