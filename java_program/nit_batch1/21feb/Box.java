
public class Box {

	private float height;  
	private float width;  
	private float length; 
	
	  //constructor
	  Box(){
	  System.out.println("box constructor called");
			height=10;	  
			width=20;	  
			length=30;	  
	  }
	
	
	  //constructor
	  Box(float v){
	  System.out.println("box 1 arg constructor called");
			height=v;	  
			width=v;	  
			length=v;	  
	  }
	
	
	
	  //constructor
	  Box(float height, float width , float length){
	  System.out.println("box 3 arg constructor called");
			this.height=height;	  
			this.width=width;	  
			this.length=length;	  
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
