package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Utilities.DataLoadFilesUtilites;
import io.cucumber.java.en.*;

public class DataLoadFilesStepDef {
    
	WebDriver driver = null;
	DataLoadFilesUtilites dataLoad = new DataLoadFilesUtilites();
	@Given("Login into AWS console")
	public void login_into_aws_console() {
		
		dataLoad.loginMethod();
		System.out.println("Login into AWS console");
		
	}
	
	@When("Search for S3 Bucket name in search text box")
	public void search_for_s3_bucket_name_in_search_text_box() {
		dataLoad.bucketNameSearch();
		System.out.println("Login into AWS console");
	}

	@When("Search for different (.*) in search text box")
	public void search_for_different_load_names_in_search_text_box(String loadName) {
		dataLoad.loadfFileSearch(loadName);
		System.out.println("Search for different load names in search text box");
	}

	@Then("Verify dat File is present in that location")
	public void verify_dat_file_is_present_in_that_location() {
		dataLoad.verifyLoadFiles();
		System.out.println("Verify dat File is present in that location");
	}

}
