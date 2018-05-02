package com.aliyun.myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MywebApplication {

	public static void main(String[] args) {
	    String s = "bbb";
        int i = s.hashCode();
        System.out.println(i);
		SpringApplication.run(MywebApplication.class, args);
	}
}
