package com.melaku.Custemor;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableAutoConfiguration(exclude= DataSourceAutoConfiguration.class )
//@ComponentScan(basePackages={"com.melaku.Custemor"})
//@ComponentScan({"com.melaku.Custemor.Setvice"})
//@EnableJpaRepositories("com.melaku.Custemor.Repository")

public class Application {
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
