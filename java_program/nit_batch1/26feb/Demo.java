
import java.util.Calendar;

public class Demo {
	public static void main(String[] args) {
    
		//Calendar cal  = new Calendar();
		Calendar cal  = null;
		cal = Calendar.getInstance();
		
 /*Lock l1  = new Lock();
 Lock l2  = new Lock();
 	  //setter
*/		
		Lock l1  = Lock.getLock();
		Lock l2  = Lock.getLock();
		
	}

}


class Lock{
	private  Lock() {
	
	}
	
	public static Lock getLock(){
		
		Lock l = new Lock();
		//sett all thing
		
		return l;
	}
	
}



