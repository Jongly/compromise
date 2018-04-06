package com.is.compromise.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot 应用启动主程序
 * 
 * @author Jongly Ran（斑石）
 * @version 2018年4月6日
 */
@SpringBootApplication(scanBasePackages = {"com.is.compromise"})
@EnableAutoConfiguration
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
	}

}
