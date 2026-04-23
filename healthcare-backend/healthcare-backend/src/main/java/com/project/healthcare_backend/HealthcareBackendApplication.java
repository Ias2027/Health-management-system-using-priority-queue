package com.project.healthcare_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

@SpringBootApplication
public class HealthcareBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner checkDatabaseConnection(DataSource dataSource) {
		return args -> {
			try (Connection connection = dataSource.getConnection()) {
				DatabaseMetaData metaData = connection.getMetaData();
				System.out.println("\n\n=========================================");
				System.out.println("✅ DATABASE CONNECTION SUCCESSFUL!");
				System.out.println("Connected to: " + metaData.getDatabaseProductName() + " " + metaData.getDatabaseProductVersion());
				System.out.println("URL: " + metaData.getURL());
				System.out.println("=========================================\n\n");
			} catch (Exception e) {
				System.err.println("\n\n=========================================");
				System.err.println("❌ FAILED TO CONNECT TO DATABASE");
				System.err.println("Error: " + e.getMessage());
				System.err.println("=========================================\n\n");
			}
		};
	}
}
