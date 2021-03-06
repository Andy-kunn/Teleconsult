package br.com.inf.es.telemedicina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching

public class TelemedicinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelemedicinaApplication.class, args);
	}

}
