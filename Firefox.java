package Waverley;

public class Firefox implements Browser {

	public Firefox(String name2) {
	      // constructor
	      System.out.println("Firefox constructor executed: "+name2 );
	   }
	
	public void Click(String elementPath) {
	      
	      System.out.println("Clicking: "+elementPath);
	   }
	
}
