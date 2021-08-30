package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.ReportingClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = {
		"org.step" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"html:C:\\Users\\Subash\\eclipse-workspace\\Cucumberhook\\Report\\File",
				"json:C:\\Users\\Subash\\eclipse-workspace\\Cucumberhook\\Report\\adac.json",
				"junit:C:\\Users\\Subash\\eclipse-workspace\\Cucumberhook\\Report\\Adac.xml",
				"json:C:\\\\Users\\\\Subash\\\\eclipse-workspace\\\\Cucumberhook\\\\Report\\\\ada.json" }, snippets = SnippetType.CAMELCASE, strict = false)

public class Runner {
	@AfterClass
	public static void afterClass() {
		ReportingClass.JvmReportGeneration("C:\\Users\\Subash\\eclipse-workspace\\Cucumberhook\\Report\\ada.json");

	}
}
