package com.cafe24.jblog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cafe24.jblog.web.FileuploadConfig;
import com.cafe24.jblog.web.MVCConfig;
import com.cafe24.jblog.web.MessageConfig;
import com.cafe24.jblog.web.SecurityConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({ "com.cafe24.jblog.controller", "com.cafe24.jblog.exception" })
@Import({MVCConfig.class, FileuploadConfig.class, MessageConfig.class, SecurityConfig.class})
public class WebConfig {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);

		return resolver;
	}
}
