package Waverley;

public class TestQA {
	
	public static String vkey = "//button[@class='key' and text()='%s']";	
	

	public static void main(String[] args) {
	  System.out.println("Start programm...");	
	  
	  String X="1";
	  String elem;
	  elem = String.format(vkey, X);	  
	  System.out.println(elem);
      Chrome testchrome = new Chrome();
      testchrome.click(elem);
      Firefox testfirefox = new Firefox();
      testfirefox.click(elem);
	}

}
