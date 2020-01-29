package testapp;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestApp {
		
		@Test
		public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareDetails\\Selenium\\Selenium Browsers Jars\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("dropdownMenuButton")).click();
		Thread.sleep(5);
		List<WebElement> dd_menu=driver.findElements(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
		for(int i=0;i<dd_menu.size();i++) {
			WebElement element=dd_menu.get(i);
			String getElemet=element.getAttribute("Another action");
			System.out.println(getElemet);
		
//		driver.close();
	
	} }
		
	

}
