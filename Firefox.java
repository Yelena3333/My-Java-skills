package WPackage;

public class Firefox implements Browser {
	
   private String browseName  = "Firefox";	
	
   public void click(String elementPath) {	      
	  System.out.println("Clicking "+elementPath+" in a "+browseName+" browser.");
   }
}
