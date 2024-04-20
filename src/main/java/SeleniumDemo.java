    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
    import java.util.List;

    public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {
       WebDriver wd= new ChromeDriver();
        WebDriver wd1= new ChromeDriver();
        WebDriver wd2=new ChromeDriver();

        //Go to youtube.com and search podtest
      wd.get("https://www.youtube.com/");
       wd.findElement(By.xpath("//input[@id='search']")).sendKeys("podtest");
       wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
       wd.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']//div")).click();
       wd.quit();
       //go to facebook and sign in
        wd1.get("https://www.facebook.com/login.php/");
        wd1.findElement(By.xpath("//input[@id='email']")).sendKeys("9373450596");
        wd1.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@123");
       Thread.sleep(1000);
        wd1.findElement(By.xpath("//button[@name='login']")).click();
      wd1.quit();

        //go to Times of India website
        wd2.get("https://timesofindia.indiatimes.com/");
        Thread.sleep(2000);
  List<WebElement> redTag = wd2.findElements(By.tagName("a"));
        System.out.println(redTag.size());
}
}
