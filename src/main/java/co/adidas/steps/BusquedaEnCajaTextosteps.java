package co.adidas.steps;

import co.adidas.PageObjects.AdidasPages;
import co.adidas.utils.Esperaimplicita;
import co.adidas.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BusquedaEnCajaTextosteps extends MetodoSeleniumSteps{
    AdidasPages adidasPages = new AdidasPages();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    Esperaimplicita esperaimplicita = new Esperaimplicita();

     public void buscarProductos(){
         esperaimplicita.esperar(60);

         try{
             leerExcel = Excel.readExcel("Parametros RETO POM.xlsx","Terminos busqueda");
         } catch(IOException e){e.printStackTrace();}

         for (int i=0;i<leerExcel.size();i++)
         {
             esperaimplicita.esperar(5);
             if(i==1) clickear(adidasPages.getBtnCerrar());
             escribirmasenter(adidasPages.getBtnBuscador(),leerExcel.get(i).get("Buscar"));
             limpiarelemento(adidasPages.getBtnBuscador());

         }
     }
}
