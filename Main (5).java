
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class CopyTheText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Piyush Singh");
		
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.CONTROL+"a");
		
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.CONTROL+"v");
		
		System.out.println(driver.getTitle());
	}
}
