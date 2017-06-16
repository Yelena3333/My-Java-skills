package WPackage;

public class Firefox implements Browser {
	
	private String browseName  = " in a Firefox browser.";
	
	
	public void click(String elementPath) {
	      
	      System.out.println("Clicking: "+elementPath+browseName);
	   }
	
}
