package com.server.jobRunr;

import org.jobrunr.configuration.JobRunr;
import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.server.JobActivator;
import org.jobrunr.storage.sql.common.SqlStorageProviderFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;
import java.nio.file.Paths;
import java.util.ArrayList;

@SpringBootApplication
//		(exclude = {DataSourceAutoConfiguration.class })
public class JobRunrApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobRunrApplication.class, args);
	}

//	@Bean
//	public JobScheduler initJobRunr(DataSource dataSource, JobActivator jobActivator) {
//		return JobRunr.configure()
//				.useJobActivator(jobActivator)
//				.useStorageProvider(SqlStorageProviderFactory
//						.using(dataSource))
//				.useBackgroundJobServer()
//				.useDashboard()
//				.initialize().getJobScheduler();
//	}

  //from properties or from bean data source for jobRunr
	@Bean
	public DataSource jobDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("org.h2.Driver");
//		dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/runr");
		dataSource.setUsername("root");
		dataSource.setPassword("nisum123");

		return dataSource;
	}


	//its running SQL Lite as data source for jobRunr
//	@Bean
//	public SQLiteDataSource dataSource() {
//		final SQLiteDataSource dataSource = new SQLiteDataSource();
//		dataSource.setUrl("jdbc:sqlite:" + Paths.get(System.getProperty("java.io.tmpdir"), "jobrunr-example.db"));
//		return dataSource;
//	}
}
