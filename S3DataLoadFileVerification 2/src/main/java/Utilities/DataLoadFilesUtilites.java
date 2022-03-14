package Utilities;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class DataLoadFilesUtilites {

	private static final String EXE_LOCATION = "C:/Users/HI/Documents/ChromeDriver/chromedriver.exe";
	private static final String AWS_CONSOLE_URL ="" ;
	private static final String BUCKET_NAME ="";
	public String s3BucketSearchTextBox ="";
	public String s3BucketValueSelection ="";
	public String loadFileValueSelection ="";
	public String loadFileYear ="";
	public String multipleDataLoads ="";
	public String multipleDataLoadFiles ="";
	
	
	
	
	WebDriver driver = null;

	public void loginMethod() {

		System.setProperty("webdriver.chrome.driver", EXE_LOCATION);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(AWS_CONSOLE_URL);
	}

	public void bucketNameSearch() {
		// Search for S3 bucket name
		driver.findElement(By.xpath(s3BucketSearchTextBox)).sendKeys(BUCKET_NAME);
		// Click on the bucket name
		driver.findElement(By.xpath(s3BucketValueSelection)).click();

	}

	public void loadfFileSearch(String loadName) {

		// enter the path in that text box
		driver.findElement(By.xpath(s3BucketSearchTextBox)).sendKeys("");
		// need to click on that load file
		driver.findElement(By.xpath((loadFileValueSelection).replace("xxx", loadName)));

	}

	public void verifyLoadFiles() {

		List<WebElement> loadValues = driver.findElements(By.xpath(loadFileYear));
		for (WebElement value : loadValues) {
			value.click();
			int fileValues = driver.findElements(By.xpath(multipleDataLoads)).size();
			for (int i = 1; i <= fileValues; i++) {
				String Loadfilename = driver.findElement(By.xpath(multipleDataLoadFiles)).getText();
				if (Loadfilename.equals("")) {
					driver.findElement(By.xpath("")).click();
				}

			}

		}
	}
}
