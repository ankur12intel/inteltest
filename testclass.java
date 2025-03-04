package ankur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import browser.HomePage;
import browser.SearchResultsPage;
import browser.URLcheck;

public class testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AditiAnkur\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 

		//Test 1/step-1 navigate to homepage
		driver.get("http://brighthorizons.com");
		driver.manage().window().maximize();
	
		 try {
	
	HomePage homePage = new HomePage(driver);
	homePage.cookieAcceptButton();
	homePage.clickSearchButton();
	
	SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
	
	if(searchResultsPage.isSearchFieldVisible()) {
		System.out.println("The search field is visible.");
		
		searchResultsPage.performSearch("Employee Education in 2018: Strategies to Watch");
		
		 Thread.sleep(5000);
		 
		 String searchResultText = searchResultsPage.getFirstSearchResultText();
		 String searchexpectedtext="Employee Education in 2018: Strategies to Watch";
		 
		if (searchResultText.equals(searchexpectedtext))
		{
            System.out.println("The text matches!");
		}
            else {
                System.out.println("The text does not match!");
                System.out.println("Expected: " + searchexpectedtext);
                System.out.println("Actual: " + searchResultText);
		
	}
	}
	
	
            else {
                System.out.println("The search field is not visible.");
                
            } 
	URLcheck urlcheck = new URLcheck(driver);
  	 urlcheck.findAcceptButton();
  	 urlcheck.urlcontains();
  	 Thread.sleep(5000);
  	 urlcheck.newyorkclick();
  	 
  	 
  	
  	String verifytext=urlcheck.verifytextmethod();
  	String middletext ="Bright Horizons at 20 Pine";
	
	if (verifytext.equals(middletext))
	{
        System.out.println("The text matches!");
	}
        else {
            System.out.println("The text does not match!");
            System.out.println("Expected: " + verifytext);
            System.out.println("Actual: " + middletext);
	
}
	Thread.sleep(5000);
	urlcheck.clickcenterbutton();
	urlcheck.checkandcompare();
	urlcheck.checkandcompareaddress();

	
	
	}catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        
     
   	 
   	 
   	 
   	 
   	 
    }finally {
        // Quit the driver after the test
        driver.quit();
    }
		 }
	
}
	
	

