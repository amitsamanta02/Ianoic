package org.amit.invman.Ianoic.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.amit.invman.Ianoic")
@PropertySource(value = { "classpath:application.properties" })
@Component
public class IanoicAutoconfig {
	
	public static Logger log = LoggerFactory.getLogger(IanoicAutoconfig.class);
    
    @Bean
    public DataSource dataSource()
    {
    	BasicDataSource dsm = new BasicDataSource();
    	dsm.setUrl("jdbc:mysql://localhost:3306/MasterProduct");
    	dsm.setUsername("root");
    	dsm.setPassword("Madhabi@1989");
    	dsm.setDriverClassName("com.mysql.cj.jdbc.Driver");
    	log.info("ds-product"+dsm);
    	return dsm;
    }
    
}
