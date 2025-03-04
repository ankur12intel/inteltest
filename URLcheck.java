package browser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class URLcheck<string> {
		
		WebDriver driver;
		
		public URLcheck(WebDriver driver){
	        this.driver = driver;
	    }
		
		By findacenterbutton= By.xpath("/html/body/nav/div[3]/ul/li[7]");
		By NewYorkbutton = By.xpath("/html/body/main/section/div[1]/div/form/div/div[1]/input");
		By brighthorizondisplay=By.xpath("html/body/main/section/div[3]/div[2]/div[1]/div[1]/h3");
		By verifytext=By.xpath("/html/body/main/section/div[3]/div[1]/div/div/div[2]");
		By middletext =By.xpath("/html/body/main/section/div[3]/div[3]/div[1]/div[1]/h3");
		By centerbutton =By.xpath("/html/body/main/section/div[3]/div[2]/div[1]/div[1]/span[2]");
		By address =By.xpath("/html/body/main/section/div[3]/div[2]/div[1]/div[1]/span[2]");
		By addresscompare =By.xpath("/html/body/main/section/div[2]/div/div/div[3]/div[1]/div[2]/div/div[4]/div/div/div/div[1]/div[2]/div/div/div[2]/div[1]");
		By brighthorizontext=By.xpath("//*[@id=\"1489\"]/div[1]/div[1]/h3");
		
		By brighthorizontextcompare=By.xpath("/html/body/main/section/div[2]/div/div/div[3]/div[1]/div[2]/div/div[4]/div/div/div/div[1]/div[2]/div/div/span[1]");
		
		
		
		public void findAcceptButton() {
		    
		       driver.findElement(findacenterbutton).click();
			}	
		public void urlcontains() {
			String currentURL=driver.getCurrentUrl();
			if (currentURL.contains("/child-care-locator")) {
		         System.out.println("The URL contains '/child-care-locator'.");
		     } else {
		         System.out.println("The URL does not contain '/child-care-locator'.");
		     }
		}
			public void newyorkclick() throws InterruptedException{
			    
			       driver.findElement(NewYorkbutton).clear();
			       driver.findElement(NewYorkbutton).sendKeys("NEW YORK");
			       Thread.sleep(5000);
			       driver.findElement(NewYorkbutton).sendKeys(Keys.ENTER);
			       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section/div[3]/div[2]/div[1]/div[1]/span[2]")));
			       element.click();
			       
			       
			       
			      		                     // Get the list of result elements (make sure the CSS selector matches the actual list items)
		            //List<WebElement> resultList = driver.findElements(By.cssSelector(".result-list-item")); // Replace with the appropriate CSS selector for the list items

		            // Check if the list has results
		            //if (resultList.size() > 0) {
		                // Click on the first result in the list
		                //resultList.get(0).click();

		                // Optionally, you can wait for further actions or assertions after clicking the first result
		               // System.out.println("First result clicked!");
		            } //else {
		                //System.out.println("No results found.");
		           
			//}
			
			public String verifytextmethod() {
		        return driver.findElement(verifytext).getText();
		    }
			
			public void clickcenterbutton() {
				 driver.findElement(centerbutton).click(); 
			
			}
			
			public void checkandcompare() throws InterruptedException {
				
				String text1=driver.findElement(brighthorizontext).getText();
				System.out.println("Text retrieved: " + text1);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section/div[2]/div/div/div[3]/div[1]/div[2]/div/div[4]/div/div/div/div[1]/div[2]/div/div/span[1]")));
				String text2=driver.findElement(brighthorizontextcompare).getText();
				System.out.println("Text retrieved: " + text2);
				
				if (text1.equals(text2))
				{
			        System.out.println("both name are same");
				}
			        else {
			            System.out.println("The text does not match!");
			            System.out.println("Expected: " + text1);
			            System.out.println("Actual: " + text2);
			        }
			}
			            public void checkandcompareaddress(){
			            String text3=driver.findElement(address).getText();
			            String address1 = text3.replaceAll("\\s+", " ").trim();
						System.out.println("Text retrieved: " + address1);
						WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
					    WebElement element3 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section/div[2]/div/div/div[3]/div[1]/div[2]/div/div[4]/div/div/div/div[1]/div[2]/div/div/div[2]/div[1]")));
						String text4=driver.findElement(addresscompare).getText();
						String address2 = text4.replaceAll("\\s+", " ").trim();
						System.out.println("Text retrieved: " + address2);
						
						
						
						if (address1.equals(address2))
						{
					        System.out.println("both address are  same");
						}
					        else {
					            System.out.println("The address does not match!");
					            System.out.println("Expected: " + address1);
					            System.out.println("Actual: " + address2);
					        }   
					            
						
					}
						            
			            
	
			
				
				
				

		        
			}
		
	
