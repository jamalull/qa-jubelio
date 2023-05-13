package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class add_stock_inventory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// initialitation for use driver chroome for testing.
		System.setProperty("webdriver.chrome.driver", "C://Users//ASUS//Selenium-QA-Jubelio/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// initialitation for get url and visiting to this link site.
		driver.get("https://app.jubelio.com/login");
		//System.out.println(driver.getTitle());
		
		
		
		
//		=============== Step to test ===========
		
//		******* 1) LOGIN FEATURE ********
		
		// find input with css selector and get this input for entered username.
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("qa.rakamin.jubelio@gmail.com");
		
		// find input with css selector and get this input for entered password
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Jubelio123!");
		
		driver.findElement(By.cssSelector(".ladda-button")).click();
		
		// Pause for 5 second to wait some response on web apps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Check validate that login is failed will appear pop up error on the top site of Jubelio
		Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Selamat Datang')]")).getText(), "Selamat Datang");
				
		// get the pop up of allert to ensure that login failed cause error on your email or password.
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Selamat Datang')]")).getText());
		
		
		
		
//		******* 2) ENTER TO PRODUCT ********
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Xpath for button "Barang" in Dashboard.
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		// Pause for 5 second to wait some response on web apps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Xpath for button "Katalog" in Dashboard
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/nav[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
		
		// Pause for 5 second to wait some response on web apps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Xpath for button "In Review" in Dashboard
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/nav[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		// Pause for 5 second to wait some response on web apps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Find product and enter to it for change stock.
		driver.findElement(By.xpath("//h4[contains(text(),'Baju pria')]")).click();
		
		// Pause for 5 second to wait some response on web apps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
//		******* 2) CHANGE STOCK ITEM OF PRODUCT ********
		
		// get input field of stock and change number to incremental.
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[2]/img[1]")).click();
		
		// Pause for 5 second to wait some response on web apps.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Change stock number and then click save button.
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[3]/div[1]/div[3]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[3]/div[4]/div[2]/button[1]")).click(); 
		
	}
}
