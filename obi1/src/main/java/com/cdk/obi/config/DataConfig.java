package com.cdk.obi.config;

import javax.sql.DataSource;
//import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan("com.cdk.obi.mapper")
public class DataConfig {
	DataConfig() {
		System.out.println("DataConfig Created");
	}

	@Bean
	public DataSource getDataSource() {
		// DataSource dataSource = new DataSource();
		// dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		// dataSource.setUrl("jdbc:mysql://localhost:3306/concretepage");
		// dataSource.setUsername("root");
		// dataSource.setPassword("");
		// return dataSource;
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 dataSource.setDriverClassName("org.postgresql.Driver");
		 dataSource.setUrl("jdbc:postgresql://localhost:3306/concretepage");
		 dataSource.setUsername("root");
		 dataSource.setPassword("");
		 return dataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(getDataSource());
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		return sessionFactory.getObject();
	}
	// @Bean
	// public UserMapper userMapper() throws Exception {
	// final SqlSessionTemplate sessionTemplate = new
	// SqlSessionTemplate(sqlSessionFactory().getObject());
	// return sessionTemplate.getMapper(UserMapper.class);
	// }
}