package com.klasevich.spring.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.flywaydb.core.Flyway;
import org.h2.jdbcx.JdbcConnectionPool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

import static com.klasevich.spring.properties.Properties.H2_PASSWORD;
import static com.klasevich.spring.properties.Properties.H2_URL;
import static com.klasevich.spring.properties.Properties.H2_USER;
import static com.klasevich.spring.properties.Properties.MIGRATION_LOCATION;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.klasevich.spring"})
public class AppConfig {

    @Bean(initMethod = "migrate")
    public Flyway flyway() {
        return Flyway.configure()
                .dataSource(H2_URL, H2_USER, H2_PASSWORD)
                .locations(MIGRATION_LOCATION)
                .load();
    }

    @Bean
    @DependsOn("flyway")
    public JdbcConnectionPool jdbcConnectionPool() {
        return JdbcConnectionPool.create(H2_URL, H2_USER, H2_PASSWORD);
    }

    @Bean
    @DependsOn("flyway")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("org.h2.Driver");
        cpds.setJdbcUrl("jdbc:h2:mem:employees_database;DB_CLOSE_DELAY=-1");
        cpds.setUser("sa");
        cpds.setPassword("");
        return cpds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() throws PropertyVetoException {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.klasevich.spring");

        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.setProperty("format_sql", "true");
        properties.setProperty("show_sql", "true");

        sessionFactory.setHibernateProperties(properties);
        return sessionFactory;
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws PropertyVetoException {
        HibernateTransactionManager transactionManager
                = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }
}
