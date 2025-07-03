package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	// here u can use n number of reusable codes like screenshot, waits and etc
	public void switchWindowToChild() {
		Set<String> w = driver.getWindowHandles();
		Iterator<String> i =  w.iterator();
		String parent = i.next();
		String child = i.next();
		driver.switchTo().window(child);
	}
}
