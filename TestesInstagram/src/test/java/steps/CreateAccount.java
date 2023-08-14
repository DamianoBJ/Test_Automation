package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateAccount {

    public static WebDriver driver;

    @Given("^browser instagram is open, in home page$")
    public void browserInstagramIsOpenInHomePage() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.get("https://www.instagram.com/");
    }

    @And("^Click in button Sign in, but dont have any infformation of user / pass$")
    public void clickInButtonSignInButDontHaveAnyInfformationOfUserPass() {
        driver.findElement(By.cssSelector("body._a3wf._-kb.segoe:nth-child(3) div.x9f619.x1n2onr6.x1ja2u2z:nth-child(1) div.x78zum5.xdt5ytf.x1n2onr6.x1ja2u2z div.x78zum5.xdt5ytf.x1n2onr6 div.x78zum5.xdt5ytf.x1n2onr6.xat3117.xxzkxad div.x78zum5.xdt5ytf.x10cihs4.x1t2pt76.x1n2onr6.x1ja2u2z:nth-child(1) section.x78zum5.xdt5ytf.x1iyjqo2.xg6iff7.x6ikm8r.x10wlt62:nth-child(1) main._a993._a994 article.x1qjc9v5.x6umtig.x1b1mbwd.xaqea5y.xav7gou.x9f619.x78zum5.x1q0g3np.x1iyjqo2.x2lah0s.xk390pu.xl56j7k.xg87l8a.xkrivgy.xat24cr.x1gryazu.x1ykew4q.xexx8yu.x4uap5.x1gan7if.xkhd6sd.x11njtxf.xh8yej3.x1d2lwc3 div._ab1y div._ab21:nth-child(1) div._ab3a form._ab3b div.x9f619.xjbqb8w.x78zum5.x168nmei.x13lgxp2.x5pf9jr.xo71vjh.xqui205.x1n2onr6.x1plvlek.xryxfnj.x1c4vz4f.x2lah0s.xdt5ytf.xqjyukv.x1qjc9v5.x1oa3qoh.x1nhvcw1 > div.x9f619.xjbqb8w.x78zum5.x168nmei.x13lgxp2.x5pf9jr.xo71vjh.x1xmf6yo.x1e56ztr.x540dpk.x1m39q7l.x1n2onr6.x1plvlek.xryxfnj.x1c4vz4f.x2lah0s.xdt5ytf.xqjyukv.x1qjc9v5.x1oa3qoh.x1nhvcw1:nth-child(3)")).click();
    }

    @When("^Click in Sign up$")
    public void clickInSignUp() {
        driver.findElement(By.cssSelector("")).click();
    }

    @And("^open page to create account$")
    public void openPageToCreateAccount() {
        driver.findElement(By.xpath("Cadastra-se")).click();
        Assert.assertEquals(driver.getTitle(),"Cadastre-se • Instagram");
    }

    @Then("^fill in the fields email, Name, Name User, Password$")
    public void fillInTheFieldsEmailNameNameUserPassword() {
        driver.findElement(By.name("emailOrPhone")).click();
        driver.findElement(By.cssSelector("emailOrPhone")).sendKeys("teste");
        driver.findElement(By.cssSelector("fullName")).click();
        driver.findElement(By.cssSelector("fullName")).sendKeys("teste teste");
    }

    @And("^Clink in Sign up$")
    public void clinkInSignUp() {
        Assert.assertEquals(driver.getTitle(),"Instagram");
    }

    @And("^Open de homepage of instagram to navegate in the website$")
    public void openDeHomepageOfInstagramToNavegateInTheWebsite() {
        Assert.assertEquals(driver.getTitle(),"Instagram");
    }


}
