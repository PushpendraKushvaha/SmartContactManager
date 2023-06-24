package com.smart;

import java.io.PrintStream;

import org.hibernate.annotations.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SmartcontactmanagerApplication implements Banner{

	public static void main(String[] args) {
		new SpringApplicationBuilder()
		  .sources(Parent.class)
		  .child(SmartcontactmanagerApplication.class)
		  .bannerMode(Banner.Mode.OFF)
		  .run(args);

	}

	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
		// TODO Auto-generated method stub
		
	}

}
