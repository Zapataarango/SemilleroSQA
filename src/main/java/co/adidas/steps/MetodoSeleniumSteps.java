package co.adidas.steps;

import co.adidas.driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class MetodoSeleniumSteps {

    public void clickear(By localizador) {
        SeleniumWebDriver.driver.findElement(localizador).click();
    }
    public void limpiarelemento(By localizador) {
        SeleniumWebDriver.driver.findElement(localizador).clear();
    }

    public void escribirmasenter(By localizador, String texto) {
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto, Keys.ENTER);
    }

    public String getTxtelemento(By localizador){
        return SeleniumWebDriver.driver.findElement(localizador).getText();
    }

    public void validacion(By localizador, String texto)
    {
        assertEquals(getTxtelemento(localizador),texto);
    }
}
