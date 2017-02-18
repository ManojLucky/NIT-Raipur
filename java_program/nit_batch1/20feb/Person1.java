
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  Person1{

		private String name;
		private 	int age;
		private String mobile;
		
		
		public String getName(){
		     //validation
		  return name;
		}
		
		public int getAge(){
		  return  age;
		}
		
		
	public String getMobile(){
		     //validation
		  return mobile;
		}
		
		
		
		public void setName(String n){
			//validation   must not be null or empty
			if(n==null){
			System.out.println("name must not null");
			  return ;
			}
			
			if(n.isEmpty()==true){
			  System.out.println("name must not empty");
			  return ;
			}
			if(n.length()<3 || n.length() >20 ){
				System.out.println("name length must be between 3-20 character");
			return;
			}
			
     		
		  name=n;
	  }
		
		
public void setAge(int a){
  if(a<1 || a>150){
   System.out.println("age"+a+ "must be in range 1-150");
  return ;
  }
  age=a;
  
}

public void setMobile(String m){
  mobile=m;
}		
		

}//class