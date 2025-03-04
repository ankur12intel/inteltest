package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage  {
WebDriver driver;
    
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }
    By searchField  = By.xpath("/html/body/nav/div[3]/ul/li[10]/nav/div/div/div/div[3]/form");  
    By searchbox   = By.xpath("/html/body/nav/div[3]/ul/li[10]/nav/div/div/div/div[3]/form/input");
    By search     =  By.xpath("/html/body/nav/div[3]/ul/li[10]/nav/div/div/div/div[3]/form/button");
    By searchresult  =By.xpath("/html/body/main/section[2]/div[2]/a[1]/div/h3");
    
    public boolean isSearchFieldVisible() {
        return driver.findElement(searchField).isDisplayed();
    }
    
    public void performSearch(String searchText) {
        driver.findElement(searchbox).sendKeys(searchText);
        driver.findElement(search).click();
    }
    
    public String getFirstSearchResultText() {
        return driver.findElement(searchresult).getText();
    }
}
    
    



