package Waverley;


public class testQA {
	
	public static final String vkey = "//button[@class='key' and text()='%s']";
	
	public testQA(String name) {
	      // constructor
	      System.out.println("constructor executed: "+name );
	   }
	
	

	public static void main(String[] args) {
	  System.out.println("Start programm...");	  
	  System.out.println(vkey);	 
	  /* Object creation */
      testQA mytest = new testQA("Create object");
      
      
	}

}
