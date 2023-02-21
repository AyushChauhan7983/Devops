package seleniumScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class GmailLogin {
public static void main(String[] args) {
// TODO Auto-generated method stub
ChromeOptions options = new ChromeOptions(); 
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://accounts.google.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("abcd@gmail.com");
driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

//check the id of the element by right click on the web page and 
//inspect the element or press F12 (or shift F12)
}
}
