package com.BoredAPI.demoAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class DemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);

		String url = "https://www.boredapi.com/api/activity";

		WebClient.Builder builder = WebClient.builder() ;

		String activity = builder.build()
		.get()
		.uri(url)
		.retrieve()
		.bodyToMono(String.class)
		.block();

		System.out.print(activity);

	}

}
