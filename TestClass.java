package WPackage;

import java.util.ArrayList;
import org.apache.commons.lang3.RandomStringUtils;

public class TestClass {	
	
   public static final String VIRTUAL_KEY = "//button[@class='key' and text()='%s']";
   	
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
	
   public void keysProcessing(String mobileNumber, Browser currentBrowser) {
	  String s1;	
		  	
	  mobileNumber = mobileNumber.replaceAll("\\D","");	  	
	  String[] phoneDigits = mobileNumber.split("");	
			 		 
      for (int i = 0; i < mobileNumber.length(); i++){	    	  
		s1=String.format(VIRTUAL_KEY, phoneDigits[i]);
		currentBrowser.click(s1);
	  }		
   }
	
   public static void main(String[] args) {
	  String phoneNumber;	  
	  ArrayList<Browser> browserList = new ArrayList<Browser>();
	  Browser testBrowser;		  
		 
	  testBrowser = new Chrome(); 
	  browserList.add(0, testBrowser);
	  testBrowser = new Firefox();
	  browserList.add(1, testBrowser);
	  
	  System.out.println("Start programm...");	  
	  TestClass test = new TestClass();
	  
	  phoneNumber = test.helper();
	  test.keysProcessing(phoneNumber, browserList.get(0));
	  phoneNumber = test.helper();
	  test.keysProcessing(phoneNumber, browserList.get(1));	    
   }
}
