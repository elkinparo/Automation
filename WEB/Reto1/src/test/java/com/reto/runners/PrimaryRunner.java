package com.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/primary.feature",
        glue = {"com.reto.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")
public class PrimaryRunner {
}
