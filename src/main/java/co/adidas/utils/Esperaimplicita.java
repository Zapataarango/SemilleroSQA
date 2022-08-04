package co.adidas.utils;

import co.adidas.driver.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

public class Esperaimplicita {

    public void esperar(int segundos)

    {
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }
}
