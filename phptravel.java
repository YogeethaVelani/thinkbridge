import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class phptravel {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".//src//reference//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://www.phptravels.net/home");
	    driver.findElement(By.cssSelector(".text-center.flights ")).click();
	    //driver.findElement(By.xpath("//input[@type='radio' and @value='round']"));
	    System.out.println(driver.findElement(By.cssSelector("[class*='custom-control']")).isSelected());
        driver.findElement(By.xpath("//*[@id='flights']//form//label[@for='flightSearchRadio-1']")).click();
        //driver.findElement(By.xpath("//*[@class=\"col-8\"]/div/div/following-sibling::div[1]")).click();
        driver.findElement(By.cssSelector(".chosen-single")).click();
        driver.findElement(By.xpath("//li[text()='Business']")).click();
        driver.findElement(By.cssSelector("#s2id_location_from")).click();
        driver.findElement(By.cssSelector("#location_from")).sendKeys("MAA");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#location_from")).sendKeys(Keys.TAB);
        driver.findElement(By.cssSelector("#s2id_location_to")).click();
        driver.findElement(By.cssSelector("#location_to")).sendKeys("BOM");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#location_from")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(".//*[@id='FlightsDateStart']")).click();
        String text = driver.findElement(By.cssSelector("input[name='fadults']")).getText();
        System.out.println(text);
	}

}
