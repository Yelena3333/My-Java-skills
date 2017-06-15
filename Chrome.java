package Waverley;

public class Chrome implements Browser {
	
	private String browseName  = " in a Chrome browser.";		
	
	public void click(String elementPath) {
	      
	      System.out.println("Clicking: "+elementPath+browseName);
	   }
	
	
}
