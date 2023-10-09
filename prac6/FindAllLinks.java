package practical7;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;
public class prac7 {
	static String driverPath = "D:\\My things\\TYCS\\STQA\\geckodriver.exe";
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",driverPath);
	WebDriver driver = new FirefoxDriver();
	String appUrl = "D:\\My things\\TYCS\\garrydhar\\index1.html"; 
	driver.get(appUrl);
	Select oSelect = new
	Select(driver.findElement(By.id("continents")));
	List<WebElement> oSize = oSelect.getOptions();
	int iListSize = oSize.size();
	for(int i =0; i < iListSize ; i++)
	{
	String sValue = oSelect.getOptions().get(i).getText();
	System.out.println(sValue);
	}
	System.out.println("Total No. Items in Dropdown: "+iListSize);	
	}
}
