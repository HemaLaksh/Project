package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");     		
		
      ChromeDriver driver = new ChromeDriver();
		
	  driver.manage().window().maximize();
		
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElementByLinkText("English (UK)").click();
		
	 driver.findElementByLinkText("Create New Account").click();
	 
	 Thread.sleep(5000);
		
       driver.findElementByName("firstname").sendKeys("Kamal"); 
       
       driver.findElementByName("lastname").sendKeys("raj");
       
       driver.findElementByName("reg_email__").sendKeys("kamal@gmail.com");
       
       driver.findElementByName("reg_email_confirmation__").sendKeys("kamal@gmail.com");
   
       driver.findElementById("password_step_input").sendKeys("9177169009");
       
       driver.findElementByXPath("(//*[@name='sex'])[2]").click();
	}

}
