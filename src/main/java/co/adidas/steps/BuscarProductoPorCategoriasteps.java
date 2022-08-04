package co.adidas.steps;

import co.adidas.PageObjects.AdidasPages;
import co.adidas.utils.Esperaimplicita;

public class BuscarProductoPorCategoriasteps extends MetodoSeleniumSteps {
    AdidasPages adidasPages = new AdidasPages();
    Esperaimplicita esperaimplicita = new Esperaimplicita();



    public void buscarCategoria(){
        clickear(adidasPages.getBtnDeportes());
        esperaimplicita.esperar(5);
        clickear(adidasPages.getBtnCerrar());
        clickear(adidasPages.getBtnCamiseta());
        esperaimplicita.esperar(5);
    }
}
