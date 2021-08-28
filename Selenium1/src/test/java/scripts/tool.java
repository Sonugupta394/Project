package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tool {
	@Test
	public void tool_tip(){
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sonukumar_gupta\\Downloads\\chromedriver.exe");
	  
	  WebDriver d1;
	  
	  d1=new ChromeDriver();
	  d1.manage().window().maximize();
	  d1.get("https://ksrtc.in/oprs-web/user/add.do");
}}
