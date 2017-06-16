package WPackage;

import org.apache.commons.lang3.RandomStringUtils;

public class TestClass {	
	
	public static String vkey = "//button[@class='key' and text()='%s']";
	public String[] phone_digits = new String[10];	
	
	public String helper() {
		String key;
		String number = "";
		String country_code = "";
		String operator_code = "";
		String mobile = "";
		String whole_number = "";
		
		for (int i = 0; i < 11; i++) { 
		key= RandomStringUtils.randomNumeric(1);		
		number = number + key;	
		}
		
		country_code=number.substring(0,1);
		operator_code=number.substring(1,4);
		mobile=number.substring(4);		
		whole_number=String.format("[%s][%s][%s]", country_code, operator_code, mobile);
		System.out.println("Phone number is "+ whole_number);
	    return whole_number;		
	   }
	
	 public void keyProcessing(String mobile_number, String browser_name){
		  String s1 = new String();	
		  Browser testbrowser;			  
		 
		  System.out.println("For browser "+ browser_name);
		  
		  String[] phone_digits = mobile_number.split("");		  
		  
		  if (browser_name=="Chrome"){			  
			  testbrowser = new Chrome(); 
		  }
		  else {
		      testbrowser = new Firefox();
		  }       
		  		 
		  for (int i = 0; i < mobile_number.length(); i++) { 
			  
			  if (!phone_digits[i].equals("[") && !phone_digits[i].equals("]")){
			  s1=String.format(vkey, phone_digits[i]);
			  testbrowser.click(s1);
			  }
		      }		
	}
		

	public static void main(String[] args) {
	  String phone_number;	  
	  String[] browser_list = {"Chrome", "Firefox"};
	  
	  System.out.println("Start programm...");	  
	  TestClass test = new TestClass();
	  
	  phone_number = test.helper();
	  test.keyProcessing(phone_number, browser_list[0]);
	  phone_number = test.helper();
	  test.keyProcessing(phone_number, browser_list[1]);
	      
	}
}
