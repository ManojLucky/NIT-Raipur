
/** 
SIS: Surendra IT Solution
Auther: Surendra Kumar  Sao
S/W Architech & Corporate s/w Trainer
Exp. +7.5Yr in Sw Development.
+28 projects exp. from scratch.
Java Certified :  SCJP(98%)  & SCWCD(98%)
MCA from NIT Raipur
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G) India

*/

public abstract class  SIS{

  protected String name;
  protected String mobile;
  protected String  address;
  protected String  email;


  public void showDetails(){
  System.out.println("Name " + name);
  System.out.println("mobile " + mobile);
  System.out.println("address " + address);
  System.out.println("email " + email);
      
  }
  /*
      set all propert here
  */
 //final abstract public void setAll();//illegal combination of modifiers
  //abstract private void setAll();//illegal combination of modifiers
  //OK abstract protected  void setAll();
  abstract protected  void setAll();
  
  



}//class