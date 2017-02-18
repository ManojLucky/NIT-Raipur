
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  Person3{

		private String name;
		private 	int age;
		private char gender;
		
		
		public void aboutMe(){
		 System.out.println("name: " + name);
		 System.out.println("age: " + age);
		 System.out.println("gender: " + gender);
		
		}
		
		
		//public void setAll(String n, int a, char ch){
		public void setAll(String name, int age, char gender){
			name=name;
			age =age;
			gender=gender;
			System.out.println("inside setAll");
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			
			
	}
		
		
		
		
		
		
		
		
		

}//class