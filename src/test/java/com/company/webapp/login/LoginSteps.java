package com.company.webapp.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.webapp.BeforeSetupHelper;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class LoginSteps {

	private WebDriver firefoxDriver;
	
	@Before
	public void setUp() {
		BeforeSetupHelper.setUpFirefoxDriver();
		this.firefoxDriver = BeforeSetupHelper.getFirefoxWebdriver();
	}
	
	@Given("^Estou na página de login \"([^\"]*)\"$")
	public void estou_na_página_de_login(String pagina) throws Throwable {
		this.firefoxDriver.get(pagina);
	}

	@When("^Preencher no campo usuario o valor \"([^\"]*)\"$")
	public void preencher_no_campo_usuario_o_valor(String login) throws Throwable {
		WebElement loginInput  = this.firefoxDriver.findElement(By.xpath("//input[@id='login']"));
		loginInput.sendKeys(login);
		this.firefoxDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When("^Preencher no campo senha o valor \"([^\"]*)\"$")
	public void preencher_no_campo_senha_o_valor(String pass) throws Throwable {
		WebElement loginInput  = this.firefoxDriver.findElement(By.xpath("//input[@id='pass']"));
		loginInput.sendKeys(pass);
		this.firefoxDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When("^Pressionar o botão \"([^\"]*)\"$")
	public void pressionar_o_botão(String btnLogin) throws Throwable {
		WebElement submitInput  = this.firefoxDriver.findElement(By.xpath("//input[@id='"+ btnLogin +"']"));
		submitInput.click();
	}

	@Then("^Deveremos estar na página \"([^\"]*)\"$")
	public void deveremos_estar_na_página(String pagina) throws Throwable {
	    
	}
	
}
