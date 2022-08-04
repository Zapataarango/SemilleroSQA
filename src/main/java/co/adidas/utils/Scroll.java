package co.adidas.utils;

import co.adidas.driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scroll {

    public void scrollAElemento(By localizador){
        JavascriptExecutor jse = (JavascriptExecutor) SeleniumWebDriver.driver;
        WebElement element = SeleniumWebDriver.driver.findElement(localizador);
        jse.executeScript("arguments[0].scrollIntoView()",element);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }



}
