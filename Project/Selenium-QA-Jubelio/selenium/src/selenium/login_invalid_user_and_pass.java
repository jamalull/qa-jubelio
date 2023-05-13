package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class login_invalid_user_and_pass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// initialitation for use driver chroome for testing.
		System.setProperty("webdriver.chrome.driver", "C://Users//ASUS//Selenium-QA-Jubelio/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// initialitation for get url and visiting to this link site.
		driver.get("https://app.jubelio.com/login");
		//System.out.println(driver.getTitle());
		
		// find input with css selector and get this input for entered username. => INVALID USER & PASS
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("qarakaminjubelio@gmail.com");
		
		// find input with css selector and get this input for entered password
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Jubelio123");
		
		driver.findElement(By.cssSelector(".ladda-button")).click();
		
		// Pause for 2 second to wait some response on web apps.
		Thread.sleep(2000);
		
		// Check validate that login is failed will appear pop up error on the top site of Jubelio
		Assert.assertEquals(driver.findElement(By.xpath("//body/div[1]/div/div[1]/li")).getText(), "Password atau email anda salah.");
		
		// get the pop up of allert to ensure that login failed cause error on your email or password.
		System.out.println(driver.findElement(By.xpath("//body/div[1]/div/div[1]/li")).getText());
		
	}
}
