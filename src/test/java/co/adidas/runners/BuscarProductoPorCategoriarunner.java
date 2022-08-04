package co.adidas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = "src/test/resources/co.adidas/BuscarProductoPorCategoria.feature",
        glue = "co.adidas.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)

@RunWith(CucumberWithSerenity.class)

public class BuscarProductoPorCategoriarunner {
}
