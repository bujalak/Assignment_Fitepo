package Com.qa.pages;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fitepo_pages {
 
	WebDriver driver;
	
	public Fitepo_pages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//div[contains(text(),'Revenue Calculator')]")
	WebElement revenue_calculator;
	
	
	public WebElement get_revenue() {
		return revenue_calculator;
	}
	
	public void window_scroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
	}
	
	public void slider_scroll() {
		
		WebElement slider = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[3]"));
        Actions action = new Actions(driver);
         action.clickAndHold(slider).moveByOffset(260,0).release().perform();
	}
	
	@FindBy(xpath ="//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng\"]")
	WebElement textfield;
	
	public WebElement get_text_field() {
		return textfield;
	}
	public void clear_Text() {
		Actions action = new Actions(driver);
		action.click(textfield).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();
	}
	
	@FindBy(xpath = "(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[1]")
	WebElement checkbox1;
	
	public WebElement get_checkbox_1() {
		return checkbox1;
	}
	@FindBy(xpath = "//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"]")
	List<WebElement> checkboxes;
	
	public void checkbox_selection() throws InterruptedException {
		List<WebElement> mainlist = checkboxes;
		List<WebElement> list = checkboxes.subList(0, 3);
		
		for(WebElement e :list) {
			Thread.sleep(2000);
			e.click();
			
		}
		window_scroll();
		mainlist.get(7).click();
		
	}
	
	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body1 inter css-12bch19\"])[3]")
	WebElement total_price;
	
	public String get_total_price() {
		return total_price.getText();
	}
	
	

}
