package org.ncu.ecommerce_app.hibernate_cfg;

import org.hibernate.SessionFactory;
import org.ncu.ecommerce_app.entities.Order;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

@Configuration
public class HibernateConfig {
	
	@Bean
	public SessionFactory sessionFactory() {
		return new org.hibernate.cfg.Configuration()
				.configure()
				.addAnnotatedClass(Order.class)
				.buildSessionFactory();
	}
}
