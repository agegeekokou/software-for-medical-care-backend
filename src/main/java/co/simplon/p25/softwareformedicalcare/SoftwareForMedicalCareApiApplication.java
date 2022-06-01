package co.simplon.p25.softwareformedicalcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SoftwareForMedicalCareApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareForMedicalCareApiApplication.class, args);
	}

}
