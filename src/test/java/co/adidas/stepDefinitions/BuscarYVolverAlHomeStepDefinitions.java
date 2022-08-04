package co.adidas.stepDefinitions;

import co.adidas.driver.SeleniumWebDriver;
import co.adidas.steps.BuscarYVolverAlHomesteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BuscarYVolverAlHomeStepDefinitions {

    @Steps
    BuscarYVolverAlHomesteps buscarYVolverAlHomesteps = new BuscarYVolverAlHomesteps();

    @Cuando("^Realizo las busquedas$")
    public void realizoLasBusquedas() {
       buscarYVolverAlHomesteps.irAlHome();
    }


    @Entonces("^Se realiza satisfacotriamente$")
    public void seRealizaSatisfacotriamente() { SeleniumWebDriver.driver.close();   }
}
