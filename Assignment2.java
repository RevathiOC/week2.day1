package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sriya");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manohar");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sri");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("8+Year work experience");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Sriyamanohar@gmail.com");
		 WebElement StateProvinceGeoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select state=new Select(StateProvinceGeoId);
		 state.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 
		driver.findElement(By.linkText("Edit")).click();
		 WebElement description = driver.findElement(By.id("updateLeadForm_description"));
		 description.clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Senior3");
		 driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(4000);
		 
		 String update=driver.getTitle();
			System.out.println(update);
			
			driver.close();
		 
	}

}
