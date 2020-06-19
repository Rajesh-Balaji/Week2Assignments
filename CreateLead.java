package week2assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class,'decorative')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM/SF')]").click();
				
		driver.findElementByXPath("//a[contains(text(),'Create L')]").click();
		driver.findElementByXPath("(//input[@class='inputBox'])[1]").sendKeys("TestLeafbyRajesh");
        driver.findElementByXPath("(//input[@class='inputBox'])[3]").sendKeys("Rajesh");
		driver.findElementByXPath("(//input[@class='inputBox'])[4]").sendKeys("Balaji");
		
		Select source = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		source.selectByValue("LEAD_EMPLOYEE");
		
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("15,000");
		Select industry =new Select(driver.findElementById("createLeadForm_industryEnumId"));
		industry.selectByIndex(3);
		Select ownership = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		ownership.selectByVisibleText("S-Corporation");
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Selenium Automation Tester");
		Select marketCampaign = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		marketCampaign.selectByIndex(6);
		Select state = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		state.selectByValue("TX");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("rajesh.balaji@leaftaps.com");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9876543210");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		String finalText = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(finalText);
		

	}

}
