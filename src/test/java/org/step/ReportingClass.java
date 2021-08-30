package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	public static void JvmReportGeneration(String json) {
File file= new File("C:\\Users\\Subash\\eclipse-workspace\\Cucumberhook\\Report");
Configuration configuration=new Configuration(file, "Adactin");
configuration.addClassifications("Platform", "Win 10");
configuration.addClassifications("Browser", "Chrome");
configuration.addClassifications("Sprint no:", "32");
List<String> li=new ArrayList<String>();
li.add(json);
ReportBuilder builder=new ReportBuilder(li, configuration);
builder.generateReports();
	}

}
