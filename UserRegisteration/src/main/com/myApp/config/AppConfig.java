package main.com.myApp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan("main.com.myApp")
@PropertySource("classpath:main/application.properties")
public class AppConfig {




}
