import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

    public class Firefox {
        WebDriver Firefox = new FirefoxDriver();

        @BeforeEach
        public void beforeEachTest(){
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--incognito");
             Firefox = new FirefoxDriver();
            Firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        @AfterEach
        public void afterEachTest(){
            Firefox.quit();
        }

        @Test
        @DisplayName("Can login with real credentials and logout")
        public void canLoginWithRealCredentials(){
            Firefox.navigate().to("https://inv.bg");
            WebElement headerLoginButton = Firefox.findElement(By.className("inheaderlogin"));
            headerLoginButton.click();
            WebElement emailLoginField = Firefox.findElement(By.id("login-subdomain"));
            emailLoginField.sendKeys("iva-test");
            WebElement loginButton = Firefox.findElement(By.id("gologin"));
            loginButton.click();
            WebElement heading = Firefox.findElement(By.cssSelector("h1"));
            String headingText = heading.getText();
            Assertions.assertEquals("Вход в inv.bg", headingText);
            WebElement emailField = Firefox.findElement(By.id("loginusername"));
            emailField.sendKeys("iva_angelowa@abv.bg");
            WebElement passwordField = Firefox.findElement(By.id("loginpassword"));
            passwordField.sendKeys("123456");
            WebElement submitButton = Firefox.findElement(By.id("loginsubmit"));
            submitButton.click();
            WebElement userPanelHeader = Firefox.findElement(By.className("userpanel-header"));
            String loggedUserEmail = userPanelHeader.getText();
            Assertions.assertEquals("iva_angelowa@abv.bg", loggedUserEmail);
            userPanelHeader.click();
            WebElement logoutButton = Firefox.findElement(By.xpath("//a[@class='selenium-button-logout button-logout']"));
            logoutButton.click();



        }
    }

