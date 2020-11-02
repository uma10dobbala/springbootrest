package org.cap.apps.customerrest;

import org.cap.apps.customerrest.ProjectMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class ProjectMain {
	
	 public static void main(String args[]) {
	        SpringApplication.run(ProjectMain.class, args);
	        
	    }

}
