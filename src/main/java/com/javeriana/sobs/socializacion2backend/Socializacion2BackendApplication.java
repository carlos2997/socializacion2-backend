package com.javeriana.sobs.socializacion2backend;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javeriana.sobs.socializacion2backend.dao.PersistenceDAOImpl;

@SpringBootApplication
public class Socializacion2BackendApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Socializacion2BackendApplication.class, args);
	}

}
