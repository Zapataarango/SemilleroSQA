package co.adidas.steps;

import co.adidas.PageObjects.AdidasPages;
import co.adidas.utils.Esperaimplicita;
import co.adidas.utils.Excel;
import co.adidas.utils.Scroll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BuscarYVolverAlHomesteps extends MetodoSeleniumSteps{
    AdidasPages adidasPages = new AdidasPages();
    Esperaimplicita esperaimplicita = new Esperaimplicita();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    Scroll scroll = new Scroll();

    public void irAlHome(){
        try {    leerExcel = Excel.readExcel("Parametros RETO POM.xlsx","Validaciones");    }

        catch (IOException e) {  e.printStackTrace();    }

        for(int a=6;a>=1;a--){
            scroll.scrollAElemento(adidasPages.getBtnProducto(a));

            clickear(adidasPages.getBtnProducto(a));

            esperaimplicita.esperar(5);
            if(a==6) clickear(adidasPages.getBtnCerrar());


            validacion(adidasPages.getLblNombreProd1(),leerExcel.get(a).get("Producto"));

            clickear(adidasPages.getBtnHome());
        }
    }
}



