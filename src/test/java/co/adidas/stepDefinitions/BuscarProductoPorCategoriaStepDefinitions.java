package co.adidas.stepDefinitions;

import co.adidas.driver.SeleniumWebDriver;
import co.adidas.steps.BuscarProductoPorCategoriasteps;
import co.adidas.utils.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import co.adidas.PageObjects.AdidasPages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BuscarProductoPorCategoriaStepDefinitions {

    @Steps
    BuscarProductoPorCategoriasteps buscarProductoPorCategoriasteps = new BuscarProductoPorCategoriasteps();

    @Cuando("^Selecciono la categoria$")
    public void seleccionoLaCategoria() {
        buscarProductoPorCategoriasteps.buscarCategoria();
    }


    @Entonces("^Valido que se haya realizado correctamente$")
    public void validoQueSeHayaRealizadoCorrectamente() {
        AdidasPages adidasPages = new AdidasPages();
         ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
        try {
            leerExcel = Excel.readExcel("Parametros RETO POM.xlsx","Validaciones");
        } catch (IOException e) {
            e.printStackTrace();
        }
        buscarProductoPorCategoriasteps.validacion(adidasPages.getLblCamiseta(),leerExcel.get(0).get("Producto"));

        SeleniumWebDriver.driver.close();
    }
}
