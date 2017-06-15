package Waverley;

public class Chrome implements Browser {
	
	
	public Chrome(String name1) {
	      // constructor
	      System.out.println("Chrome constructor executed: "+name1 );
	   }
	
	public void Click(String elementPath) {
	      
	      System.out.println("Clicking: "+elementPath);
	   }
	
	
}
