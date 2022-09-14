package pe.com.projectbanco.ptwopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PtwopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PtwopServiceApplication.class, args);
	}

}
