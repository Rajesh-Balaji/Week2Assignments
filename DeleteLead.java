package week2assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("rajesh.balaji@leaftaps.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String leadId = driver.findElementByXPath("(//div[contains(@class,'partyId')])[2]/a").getText();
		System.out.println(leadId);
		driver.findElementByXPath("(//div[contains(@class,'partyId')])[2]/a").click();
		driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[4]").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String finalMsg = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		if(finalMsg.equals("No records to display")){
			System.out.println(leadId + " is not displayed in the Find Leads search");
		}
	}

}
