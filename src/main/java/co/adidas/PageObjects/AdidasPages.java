package co.adidas.PageObjects;

import org.openqa.selenium.By;

public class AdidasPages {
    private By btnCerrar = By.xpath("(//div[@role='dialog']//button)[2]");

    private By btnBuscador = By.name("q");

    private By btnHome = By.xpath("//a[@data-auto-id='logo']");

    private By btnDeportes = By.xpath("//a[text() = 'DEPORTES']");

    private By btnCamiseta = By.xpath("//img[contains(@title, 'Camiseta Titular Selecci') and contains(@title, 'n Colombia')]");

    private By lblCamiseta = By.xpath("(//h1[@class='gl-heading gl-heading--regular gl-heading--italic name___1EbZs'])[2]");

   private By btnProducto1 = By.xpath("(//a[@class='glass-product-card__assets-link'])[1]");

   private By btnProducto2 = By.xpath("(//a[@class='glass-product-card__assets-link'])[2]");

  private By btnProducto3 = By.xpath("(//a[@class='glass-product-card__assets-link'])[3]");

    private By btnProducto4 = By.xpath("(//a[@class='glass-product-card__assets-link'])[4]");

    private By btnProducto5 = By.xpath("(//a[@class='glass-product-card__assets-link'])[5]");

    private By btnProducto6 = By.xpath("(//a[@class='glass-product-card__assets-link'])[6]");

    private By lblNombreProd1 = By.xpath("(//h1[@class='gl-heading gl-heading--regular gl-heading--italic name___1EbZs'])[2]");


    public By getBtnBuscador() {return btnBuscador;}

    public By getBtnHome() { return btnHome; }

    public By getBtnDeportes() { return btnDeportes; }

   public By getBtnProducto(int index) {
       switch (index) {
           case 1:
             return btnProducto1;
          case 2:
             return btnProducto2;
           case 3:
             return btnProducto3;
           case 4:
               return btnProducto4;
           case 5:
               return btnProducto5;
           case 6:
               return btnProducto6;
        }
       return btnProducto1;
    }
    public By getBtnCamiseta() { return btnCamiseta; }

    public By getBtnCerrar() {return btnCerrar;}

    public By getLblNombreProd1() {
        return lblNombreProd1;
    }

    public By getLblCamiseta() {
        return lblCamiseta;
    }
}
