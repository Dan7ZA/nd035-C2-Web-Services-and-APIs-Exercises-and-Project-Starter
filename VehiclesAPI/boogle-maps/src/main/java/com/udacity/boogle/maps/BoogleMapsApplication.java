package com.udacity.boogle.maps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoogleMapsApplication {

	public static void main(String[] args) {
		//System.getProperties().put( "server.port", 9191 );
		SpringApplication.run(BoogleMapsApplication.class, args);
	}

}
