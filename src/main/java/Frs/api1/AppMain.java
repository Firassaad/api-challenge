package Frs.api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "Frs.api1")
public class AppMain {
	public static void main(String[] args) {
    System.out.println("firas first app");
    SpringApplication.run(AppMain.class, args);

	}

}
