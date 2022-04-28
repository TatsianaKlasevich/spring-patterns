package com.klasevich.spring.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.flywaydb.core.Flyway;
import org.h2.jdbcx.JdbcConnectionPool;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:/application.properties")
@ComponentScan(basePackages = {"com.klasevich.spring"})
public class AppConfig {

    @Value("${database.driver}")
    String driver;
    @Value("${hibernate.dialect.property}")
    String dialect;
    @Value("${hibernate.show_sql.property}")
    String showSql;
    @Value("${hibernate.format_sql.property}")
    String formatSql;
    @Value("${database.url}")
    private String url;
    @Value("${database.user}")
    private String user;
    @Value("${database.password}")
    private String password;
    @Value("${database.migration.location}")
    private String migrationLocation;
    @Value("${database.schema}")
    private String schema;
    @Value("${entity.package.to.scan}")
    private String entityPackageScan;

    @Bean(initMethod = "migrate")
    public Flyway flyway() {
        return Flyway.configure()
                .dataSource(url, user, password)
                .locations(migrationLocation)
//                .schemas(schema)
                .load();
    }

    @Bean
    @DependsOn("flyway")
    public JdbcConnectionPool jdbcConnectionPool() {
        return JdbcConnectionPool.create(url, user, password);
    }

    @Bean
    @DependsOn("flyway")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass(driver);
        cpds.setJdbcUrl(url);
        cpds.setUser(user);
        cpds.setPassword(password);
        return cpds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() throws PropertyVetoException {

        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(entityPackageScan);
        Properties properties = new Properties();
        properties.setProperty(Environment.DIALECT, dialect);
        properties.setProperty("format_sql", "true");
        properties.setProperty("show_sql", "true");
        properties.setProperty(Environment.SHOW_SQL, showSql);
        properties.setProperty(Environment.FORMAT_SQL, formatSql);

        sessionFactory.setHibernateProperties(properties);
        return sessionFactory;
    }

    @Bean
    public HibernateTransactionManager transactionManager() throws PropertyVetoException {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory().getObject());
        return txManager;
    }
}
