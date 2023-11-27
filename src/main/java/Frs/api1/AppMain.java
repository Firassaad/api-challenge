package Frs.api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "Frs.api1.Controller")
public class AppMain {

	public static void main(String[] args) {
    System.out.println("firas first app");
    SpringApplication.run(AppMain.class, args);

	}

}
