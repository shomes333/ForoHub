package com.example.ForoHub;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.internal.util.JsonUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ForoHubApplication {

	public static void main(String[] args) {

		SpringApplication.run(ForoHubApplication.class, args);
	}

	@Bean
	public FlywayMigrationStrategy flywayMigrationStrategy() {
		return new MyFlywayMigrationStrategy();
	}

	private static class MyFlywayMigrationStrategy implements FlywayMigrationStrategy {

		@Override
		public void migrate(Flyway flyway) {
			flyway.migrate();
		}

	}

}
