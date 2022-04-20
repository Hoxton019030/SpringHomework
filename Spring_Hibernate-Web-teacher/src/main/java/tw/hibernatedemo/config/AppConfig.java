package tw.hibernatedemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class AppConfig {
	
public HikariDataSource datasource() {
	HikariConfig config = new HikariConfig();
	config.setJdbcUrl("jdbc:sqlserver://localhost:1433;databaseName=hibernateDB");
	config.setUsername("Hoxton");
	config.setPassword("orz93098");
	config.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	config.setMaximumPoolSize(5);
}

}