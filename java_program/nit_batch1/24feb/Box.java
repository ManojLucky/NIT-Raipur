
public class Box {
	//instance//object//no static  variable
	private float height;  
	private float width;  
	private float length; 
	
	//class variable /static variable   common for all
	public  static final float HEIGHT_MIN = 100f;  
	public  static final float HEIGHT_MAX = 1000f;  
	
	public  static final float WIDTH_MIN = 100f;  
	public  static final float WIDTH_MAX = 1000f;  
	
	public  static final float LENGTH_MIN = 100f;  
	public  static final float LENGTH_MAX = 1000f;  
	
	private static int totalBox;//0
	
	public Box(float hwl) {
	  height =hwl;
	  width =hwl;
	  length =hwl;
	  
	  totalBox++;
	}
	

	public Box(float height,float width, float length) {
		//validation
	  this.height= height;
	  this.width=width;
	  this.length =length ;
	  totalBox++;
	}
	
	public static int howManyBox(){
		return totalBox;
	}	
	public void showDetails(){
		System.out.println("height " +height);
		System.out.println("width " +width);
		System.out.println("length " +length);
		
		
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	 
	
}
