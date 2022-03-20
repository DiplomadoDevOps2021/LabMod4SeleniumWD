package selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    private WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:4001");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        //driver.navigate().to("https://www.google.com");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        String inputSueldo = "1500000";
        String inputAhorro = "50000000";
        System.out.println("Iniciando Pruebas...");
        WebElement sueldo = driver.findElement(By.id("js-sueldo"));
        sueldo.sendKeys(inputSueldo);
        WebElement ahorro = driver.findElement(By.id("js-ahorro"));
        ahorro.sendKeys(inputAhorro);
        driver.findElement(By.id("id-consultar")).click();
        
    }
}
