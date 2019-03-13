package com.spring.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：Fangle
 * @className:ApplicationDemo
 * @description:
 * @date:1:32 PM 2019/3/13
 */
@MapperScan(value = "com.spring.mysql.mapper")  //mapper扫描，则不需要在每个xxMapper.java中加@Mapper
@SpringBootApplication()
@RestController
public class ApplicationDemo {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDemo.class,args);
    }
}
