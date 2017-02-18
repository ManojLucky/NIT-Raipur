
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class  PersonDemo2{

public static void main(String args[]){

 Person1 p1  = new Person1();
 /*
 System.out.println("name : " + p1.name);
 System.out.println("age :" + p1.age);
 System.out.println("mobile :" + p1.mobile);
 System.out.println("---------------");
*/

p1.setName(null);
p1.setName("");
p1.setName("ra");
p1.setName("asdfjklajslf safjklasjflksadjflsfgfgf");
//p1.setName("123");
p1.setName("rahul");

p1.setAge(-22);
p1.setAge(222);
p1.setAge(22);
p1.setMobile("123445555");
 System.out.println("---------------");
System.out.println("name : " + p1.getName());
 System.out.println("age :" + p1.getAge());
 System.out.println("mobile :" + p1.getMobile());

 System.out.println("---------------");


 /*
p1.name="$ramesh";
p1.age=226;
p1.mobile="1234567890"; 
 
 */


}


}//class