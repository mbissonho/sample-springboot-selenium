package com.company.webapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginTest extends BaseSeleniumTests {
 
  @Test
  public void login() {
    driver.get("http://localhost:8080/");
    driver.manage().window().setSize(new Dimension(899, 691));
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("some@");
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("some@mail.com");
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("password");
    driver.findElement(By.cssSelector(".btnSubmit")).click();
  }
  
}
