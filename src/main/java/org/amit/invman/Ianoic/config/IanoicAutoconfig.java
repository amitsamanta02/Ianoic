package org.amit.invman.Ianoic.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.amit.inman.Ianoic")
@PropertySource(value = { "classpath:application.properties" })
@Component
public class IanoicAutoconfig {
	
    @Bean
    public DataSource dataSource()
    {
    	BasicDataSource ds = new BasicDataSource();
    	ds.setUrl("jdbc:mysql://localhost:3306/userinfo");
    	ds.setUsername("rootuser");
    	ds.setPassword("Madhabi@1989");
    	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
    	System.out.println("DataSource:"+ds);
    	return ds;
    }
    
    @Bean
    public JdbcTemplate jdbcTemplat(DataSource ds){
    	System.out.println("Creating JDBC template with new instances");
    	return new JdbcTemplate(ds);
    }
}
