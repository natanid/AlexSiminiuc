import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

public class SearchForJava {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://www.vpl.ca/");

		WebElement searchField;
		searchField = driver.findElement(By.xpath(".//*[@id='globalQuery']"));
		searchField.click();
		searchField.sendKeys("Java");

		WebElement searchButton;
		searchButton = driver.findElement(By.xpath(".//*[@id='globalSearch']/input[2]"));
		searchButton.click();
		Thread.sleep(5000);

		WebElement searchResultLink;
		searchResultLink = driver.findElement(By.xpath(".//*[@id='bib4626422038']/div[2]/div[1]/div[1]/span[1]/a"));
		searchResultLink.click();

		Thread.sleep(5000);

		WebElement bookTitleElement;
		bookTitleElement = driver.findElement(By.xpath(".//*[@id='item_bib_title']"));

		if (bookTitleElement.isDisplayed() == true)
			System.out.println("the first book name is displayed on the page");
		else
			System.out.println("the first book name is NOT displayed on the page");

		WebElement bookAuthorElement;
		bookAuthorElement = driver.findElement(By.xpath(".//*[@id='4626422038']/div/div[1]/div[1]/div[1]/h2/a"));

		if (bookAuthorElement.isDisplayed() == true)
			System.out.println("the first book author is displayed");
		else
			System.out.println("the first book author is NOT displayed");
		
		assertEquals(bookAuthorElement.isDisplayed(),true);
		
		WebElement bookYearElement;
		bookYearElement = driver.findElement(By.xpath(".//*[@id='4626422038']/div/div[1]/div[1]/div[1]/span"));
		assertEquals(bookYearElement.isDisplayed(),true);
		
		WebElement javaComputerProgramLanguageLink;
		javaComputerProgramLanguageLink = driver.findElement(By.xpath(".//*[@id='all_headings_expand']/ul/li/a"));
		
		javaComputerProgramLanguageLink.click();
		
		Thread.sleep(5000);
		
		WebElement javaComputerProgramLanguage;
		javaComputerProgramLanguage = driver.findElement(By.xpath(".//*[@id='top_banner']/div[1]/div/h1/span"));
		
		assertEquals(javaComputerProgramLanguage.isDisplayed(),true);
		

		driver.quit();
	}
}