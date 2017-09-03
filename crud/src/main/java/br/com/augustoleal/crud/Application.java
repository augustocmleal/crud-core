package br.com.augustoleal.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "br.com.augustoleal.crud")
@ImportResource("classpath:applicationcontext.xml")
public class Application {

	public static void main(String[] args) throws InterruptedException {
			
			SpringApplication.run(Application.class, args);
	}

}
