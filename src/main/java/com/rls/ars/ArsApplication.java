package com.rls.ars;

import com.rls.ars.configs.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class ArsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArsApplication.class, args);
	}

}
