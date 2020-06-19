package week2assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class,'decorative')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM/SF')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TestLeafbyRajesh");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[contains(@class,'partyId')])[2]/a").click();
		driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[3]").click();
		String companyName = driver.findElementByXPath("(//input[@class='inputBox'])[1]").getAttribute("value");
		System.out.println(companyName);
		driver.findElementByXPath("(//input[@class='inputBox'])[1]").clear();
		driver.findElementByXPath("(//input[@class='inputBox'])[1]").sendKeys("TestLeafbyRajesh_updated");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		String finalText = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(finalText);
		

	}

}
