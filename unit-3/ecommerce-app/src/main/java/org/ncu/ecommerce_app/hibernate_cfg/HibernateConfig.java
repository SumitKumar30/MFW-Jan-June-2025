package org.ncu.ecommerce_app.hibernate_cfg;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.ncu.ecommerce_app.entities.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

/*
 * @Configuration public class HibernateConfig {
 * 
 * @Bean public SessionFactory sessionFactory(DataSource dataSource) { try {
 * return new org.hibernate.cfg.Configuration()
 * .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect")
 * .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
 * .setProperty("hibernate.connection.url",
 * "jdbc:mysql://localhost:3306/ecommerce_db")
 * .setProperty("hibernate.connection.username", "root")
 * .setProperty("hibernate.connection.password", "Admin@123")
 * .setProperty("hibernate.show_sql", "true")
 * .setProperty("hibernate.hbm2ddl.auto", "update") //
 * .setProperty("hibernate.connection.autocommit", "false") // ✅ Force Hibernate
 * to manage transactions // .setProperty("hibernate.jdbc.batch_size", "20") //
 * ✅ Optimize inserts .addAnnotatedClass(Order.class) .buildSessionFactory(); }
 * catch (Exception e) { throw new
 * RuntimeException("Failed to configure Hibernate SessionFactory", e); } } }
 */