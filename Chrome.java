package WPackage;

public class Chrome implements Browser {
	
   private String browseName  = "Chrome";		
	
   public void click(String elementPath) {	      
	  System.out.println("Clicking "+elementPath+" in a "+browseName+" browser.");
   }
}