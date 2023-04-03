package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
	
}
}
