import com.sun.glass.ui.Timer;

public class Rabbit {
	
	// -----------
	// PROPERTIES
	// -----------
	int xPosition;
	 int yPosition;
	Timer timer;

	
	
	// -----------
	// CONSTRUCTOR 
	// ------------
	public Rabbit(int x,int y) {
	
		this.xPosition=x;
		this.yPosition=y;

	}
	
	
	// -----------
	// METHODS 
	// ------------
	public void printCurrentPosition() {
		System.out.println("The current position of the rabbit is: ");
		int right = 0 ;	
		int left = 0 ;	
	


	    
	}

	public void sayHello() {
		System.out.println("Hello! I am a rabbit!");
	}
	
	// ----------------
	// ACCESSOR METHODS
	// ----------------set
	public void setx(int xPosition)
	{
		this.xPosition=xPosition;
	}
	public void sety(int yPosition)
	{
		this.yPosition=yPosition;
	}
	//get
	public int getx()
	{
		return xPosition;
	}
	public int gety()
	{
		return yPosition;
	}
	
	// Put all your accessor methods in this section.
	

}




