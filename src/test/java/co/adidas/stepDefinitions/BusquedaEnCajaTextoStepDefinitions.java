package co.adidas.stepDefinitions;

import co.adidas.driver.SeleniumWebDriver;
import co.adidas.steps.BusquedaEnCajaTextosteps;
import co.adidas.utils.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BusquedaEnCajaTextoStepDefinitions {

    @Steps
    BusquedaEnCajaTextosteps busquedaEnCajaTextosteps = new BusquedaEnCajaTextosteps();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Dado("^que me encuentre en la pagina de adidas colombia$")
    public void queMeEncuentreEnLaPaginaDeAdidasColombia() {
        try{leerExcel = Excel.readExcel("Parametros RETO POM.xlsx","URL");}
        catch(IOException e){e.printStackTrace();}
        SeleniumWebDriver.chromeDrive(leerExcel.get(0).get("Link"));
    }

    @Cuando("^Busque varios productos en la caja de busqueda$")
    public void busqueVariosProductosEnLaCajaDeBusqueda() {
        busquedaEnCajaTextosteps.buscarProductos();
    }

    @Entonces("^Valido que se realice correctamente$")
    public void validoQueSeRealiceCorrectamente() {
        SeleniumWebDriver.driver.close();
    }

}
