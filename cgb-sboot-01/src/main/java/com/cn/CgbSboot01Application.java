package com.cn;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * 默认扫描本包和子包类的文件
 */

@SpringBootApplication
public class CgbSboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(CgbSboot01Application.class, args);
	}

}
