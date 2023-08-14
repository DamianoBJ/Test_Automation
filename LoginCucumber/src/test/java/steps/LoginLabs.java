package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginLabs {
    public static WebDriver drivers;

    @Given("browser swagLabs is open")
    public void browserSwagLabsIsOpen() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        drivers = new ChromeDriver();

        //drivers.manage().window().setSize(new Dimension(692, 660));
        drivers.manage().window().maximize();
        drivers.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        drivers.get("https://www.saucedemo.com/");
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        drivers.findElement(By.cssSelector("#login-button")).click();
    }

    @When("user enters user and pass")
    public void userEntersAnd() {
        drivers.findElement(By.cssSelector("#user-name")).click();
        drivers.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        drivers.findElement(By.cssSelector("#password")).click();
        drivers.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
    }

    @And("click in login button")
    public void clickInLoginButton() {
        drivers.findElement(By.id("login-button")).click();
    }

    @Then("user is navigated")
    public void userIsNavigated() {
        //drivers.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.header_secondary_container > span.title"))
        Assert.assertEquals(drivers.getTitle(),"Swag Labs");
        //driver.quit();
    }
}
