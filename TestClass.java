package WPackage;
import org.apache.commons.lang3.RandomStringUtils;

public class TestClass {	
	
   public static final String virtualKey = "//button[@class='key' and text()='%s']";
   	
   public String helper() {
	  String key, countryCode, operatorCode, mobile, wholeNumber, number;
	  
	  number = "";
	  for (int i = 0; i < 11; i++){ 
		key= RandomStringUtils.randomNumeric(1);		
		number = number + key;	
	  }
		
	  countryCode=number.substring(0,1);
	  operatorCode=number.substring(1,4);
	  mobile=number.substring(4);		
	  wholeNumber=String.format("[%s][%s][%s]", countryCode, operatorCode, mobile);
	  System.out.println("A random phone number is "+ wholeNumber);
	  return wholeNumber;		
   }
	
   public void keysProcessing(String mobileNumber, String browserName) {
	  String s1 = new String();	
	  Browser testBrowser;		  
		 
	  System.out.println("For browser "+ browserName);	
	  mobileNumber = mobileNumber.replaceAll("\\D","");	  	
	  String[] phoneDigits = mobileNumber.split("");	
	  	  
	  if (browserName=="Chrome"){			  
		testBrowser = new Chrome(); 
	  }
	  else {
		testBrowser = new Firefox();
	  }       
		  		 
      for (int i = 0; i < mobileNumber.length(); i++){	    	  
		s1=String.format(virtualKey, phoneDigits[i]);
		testBrowser.click(s1);
	  }		
   }
	
   public static void main(String[] args) {
	  String phoneNumber;	  
	  String[] browserList = {"Chrome", "Firefox"};
	  
	  System.out.println("Start programm...");	  
	  TestClass test = new TestClass();
	  
	  phoneNumber = test.helper();
	  test.keysProcessing(phoneNumber, browserList[0]);
	  phoneNumber = test.helper();
	  test.keysProcessing(phoneNumber, browserList[1]);	    
   }
}
