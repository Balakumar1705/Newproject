package com.utilities;


import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMreoprt(String jsonfile) {
		File reportDirectory = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		Configuration configuration = new Configuration(reportDirectory, "Addactin-automation");
		configuration.addClassifications("os", "windows 10");
       configuration.addClassifications("browser", "chrome");
       configuration.addClassifications("browser_version","111");
       configuration.addClassifications("sprint", "82");
       
       
      java.util.List<String> jsonFiles = new ArrayList<String>();  
      jsonFiles.add(jsonfile);
      
       ReportBuilder reportbuilder = new  ReportBuilder(jsonFiles, configuration);
       reportbuilder.generateReports();
       
	}
	
	

}
