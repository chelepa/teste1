package br.com.sicredi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SicrediApplication {

	public static void main(String[] args) {
		SpringApplication.run(SicrediApplication.class, args);
	}

}
