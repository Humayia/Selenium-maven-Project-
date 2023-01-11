package registration;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allvalidinfo {
@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://priyoshop.com/register");
		
		driver.findElement(By.name("IsEmail")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("FirstName")).sendKeys("Humayiaaaaaaa");
		Thread.sleep(2000);
		
		driver.findElement(By.name("Email")).sendKeys("Testerre44444@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("Phone")).sendKeys("01845307799");
		Thread.sleep(2000);
		
		driver.findElement(By.name("Password")).sendKeys("T123456789#");
		Thread.sleep(2000);
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("T123456789#");
		Thread.sleep(2000);
		
		driver.findElement(By.name("StreetAddress")).sendKeys("Brahmanbaria,Collegepara");
		Thread.sleep(2000);
		
		Select country = new Select(driver.findElement(By.name("CountryId")));
		country.selectByVisibleText("Bangladesh");
		Thread.sleep(2000);
		
		List<WebElement> countryValues = country.getOptions();
		for(WebElement ele : countryValues)
		{
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Bangladesh"))
			{
				System.out.println("Country is Available");
				break;
			}
		}
		Select district = new Select(driver.findElement(By.name("StateProvinceId")));
		district.selectByVisibleText("Brahmanbaria");
		Thread.sleep(2000);
		
		List<WebElement> districtValues = district.getOptions();
		for(WebElement ele : districtValues)
		{
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Brahmanbaria"))
			{
				System.out.println("District is Available");
				break;
			}
		}
		Select station = new Select(driver.findElement(By.name("City")));
		station.selectByVisibleText("Brahmanbaria Sadar");
		Thread.sleep(2000);
		
		List<WebElement> stationValues = station.getOptions();
		for(WebElement ele : stationValues)
		{
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Brahmanbaria Sadar"))
			{
				System.out.println("Police station is Available");
				break;
			}
		}
		
		
		driver.findElement(By.name("accept-privacy-policy")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("register-button")).click();
		
		
		
		driver.findElement(By.name("register-continue")).click();
		
		driver.quit();
		
		
		}
		

	}
