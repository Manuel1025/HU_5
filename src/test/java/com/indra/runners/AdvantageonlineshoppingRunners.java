package com.indra.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/advantageonlineshopping/advantageonlineshopping.feature"
        ,glue = "com.indra.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
       //,tags = "@Test4"
)

public class AdvantageonlineshoppingRunners {
}
