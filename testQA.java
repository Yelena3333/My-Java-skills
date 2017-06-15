package Waverley;


public class testQA {
	
	public static final String vkey = "//button[@class='key' and text()='%s']";
	
	public testQA(String name) {
	      // constructor
	      System.out.println("constructor executed: "+name );
	   }
	
	

	public static void main(String[] args) {
	  System.out.println("Start programm...");	  
	  /* Object creation */
      //testQA mytest = new testQA("Create object");
      Chrome testchrome = new Chrome("Crome");
      testchrome.Click(vkey);
      Firefox testfirefox = new Firefox("Firefox");
      testfirefox.Click(vkey);
	}

}
