package com.duo.toSever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 승훈이가 EC2 만들 때 까지 버티기
@SpringBootApplication
public class ToSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToSeverApplication.class, args);
	}

}
