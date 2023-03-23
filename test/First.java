import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class First {
  WebDriver chrome = new ChromeDriver();

  @BeforeEach
  public void beforeEachTest(){
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    chrome = new ChromeDriver();
    chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
  @AfterEach
  public void afterEachTest(){
    chrome.quit();
  }

  @Test
    @DisplayName("Can login with real credentials and logout")
    public void canLoginWithRealCredentials(){
      chrome.navigate().to("https://inv.bg");
    WebElement headerLoginButton = chrome.findElement(By.className("inheaderlogin"));
    headerLoginButton.click();
    WebElement emailLoginField = chrome.findElement(By.id("login-subdomain"));
    emailLoginField.sendKeys("iva-test");
    WebElement loginButton = chrome.findElement(By.id("gologin"));
    loginButton.click();
    WebElement heading = chrome.findElement(By.cssSelector("h1"));
    String headingText = heading.getText();
    Assertions.assertEquals("Вход в inv.bg", headingText);
    WebElement emailField = chrome.findElement(By.id("loginusername"));
    emailField.sendKeys("iva_angelowa@abv.bg");
    WebElement passwordField = chrome.findElement(By.id("loginpassword"));
    passwordField.sendKeys("123456");
    WebElement submitButton = chrome.findElement(By.id("loginsubmit"));
    submitButton.click();
    WebElement userPanelHeader = chrome.findElement(By.className("userpanel-header"));
    String loggedUserEmail = userPanelHeader.getText();
    Assertions.assertEquals("iva_angelowa@abv.bg", loggedUserEmail);
    userPanelHeader.click();
    WebElement logoutButton = chrome.findElement(By.xpath("//a[@class='selenium-button-logout button-logout']"));
    logoutButton.click();



  }
}
