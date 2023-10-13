package practical8;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
public class prac8 {
	static String driverPath = "D:\\My things\\TYCS\\STQA\\geckodriver.exe";
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",driverPath);
	WebDriver driver = new FirefoxDriver();
	String appUrl ="file:D:\\My things\\TYCS\\index2.html"; 
	driver.get(appUrl);
	List<WebElement> checkBoxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
	int checkedCount=0, uncheckedCount=0;
	for(int i=0; i<checkBoxes.size(); i++){
	System.out.println(i+" checkbox is selected"+checkBoxes.get(i).isSelected());
	if(checkBoxes.get(i).isSelected()) {checkedCount++;}
	else {uncheckedCount++;}
	}
	System.out.println("No. of selected checkbox: "+checkedCount);
	System.out.println("No. of unselected checkbox: "+uncheckedCount);
	}
}
