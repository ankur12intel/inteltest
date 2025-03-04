package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
        this.driver = driver;
    }
	
	By cookieAcceptButton= By.id("onetrust-accept-btn-handler");
	By searchButton = By.xpath("/html/body/nav/div[3]/ul/li[10]"); // Modify locator as needed
	
	public void cookieAcceptButton() {
	    
	       driver.findElement(cookieAcceptButton).click();
		}	 
	public void clickSearchButton() {
        driver.findElement(searchButton).click();
	}
	
}	
		
		
		
		
        // Test1/Step 2: Click a search button
		
		
		 // Test1/Step 3:Verify if search field is visible on the page
		 

		
		
		/* if (searchField.isDisplayed()) {
             System.out.println("The search field is visible.");
             
             
    		 searchbox.click();
    		 
    		 // Test1/Step 4:Type text on search field
    		 searchbox.sendKeys("Employee Education in 2018: Strategies to Watch");
    		 
    		 search.click();
    		// Test1/Step 5:Verify if the first search result is exact match to what you typed into search 

    		
    		 JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("window.scrollBy(0, 400);");
             
             
             String searchresulttext=searchresult.getText();
             String searchexpectedtext="Employee Education in 2018: Strategies to Watch";
             if (searchresulttext.equals(searchexpectedtext)) {
                 System.out.println("The text matches!");
             } 
             }
             
             
             
             
             
         } else {
             System.out.println("The search field is not visible.");
         }*/
		 		 
		 
		 


    
        
		
       
	
	
	
