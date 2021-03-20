//java config
package com.laptrinhjavaweb.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//de su dung jpaRepository
@EnableJpaRepositories(basePackages = "com.laptrinhjavaweb.repository")
@EnableTransactionManagement //bat tinh nang quan ly transaction
public class JPAConfig {
	
	//cai dat entity manager factory, entity manager factory dung de open connection.
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource()); // dataSource dung de ket noi voi database
		em.setPersistenceUnitName("persistence-data"); //persisten-date duoc dat ten trong file persisten.xml, la mot chat xuc tac de thao tac voi table.
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalProperties()); // la noi chua cau hinh cua jpa
		//add nhung tinh nang tu dong tao table tu java class (entity)
		return em;
	}
	
	// cau hinh transaction
	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	//load tu javax.sql
	@Bean
	public DataSource dataSource() { 
		DriverManagerDataSource dataSource = new DriverManagerDataSource(); //ket noi voi database
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ttshop3month2021");
		dataSource.setUsername("root");
		dataSource.setPassword("172304");
		return dataSource;
	}
	
	// tu dong generate entity tu java class sang database	
	Properties additionalProperties() {
		Properties properties = new Properties();
		// create-drop giup ta tao database tu nhung java class entity, chi dung khi tao moi, khi da on dinh(co du lieu) thi khong dung, dong lai.
//		properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		properties.setProperty("hibernate.hbm2ddl.auto", "create");
//		properties.setProperty("hibernate.hbm2ddl.auto", "update");
//		properties.setProperty("hibernate.hbm2ddl.auto", "none");
//		properties.setProperty("hibernate.hbm2ddl.auto", "validate");
		properties.setProperty("hibernate.enable_lazy_load_no_trans", "true"); //config fetch lazy
		return properties;
	}
}
