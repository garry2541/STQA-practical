package practical6;
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
public class prac6 {
	static String driverPath = "\\D:\\My things\\TYCS\\STQA\\geckodriver.exe";
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",driverPath);
	WebDriver driver = new FirefoxDriver();
	String appUrl ="https://www.google.co.in/";
	driver.get(appUrl);
	java.util.List<WebElement> links =
	driver.findElements(By.tagName("a"));
	for (int i = 1; i<links.size(); i=i+1)
	{
	System.out.println(links.get(i).getText());
	}
	System.out.println("Total No. of Links: "+links.size());
	}
}
