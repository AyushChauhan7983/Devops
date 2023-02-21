package seleniumScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class FacebookLogin {
public static void main(String[] args) {
// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions(); 
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("*****4958");
driver.findElement(By.id("pass")).sendKeys("*******");
driver.findElement(By.id("u_0_2")).click();
//check the id of the element by right click on the web page and 
//inspect the element or press F12 (or shift F12)
}
}
