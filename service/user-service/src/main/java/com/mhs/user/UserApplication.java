package com.mhs.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Tsong
 * @Date 11/03/2024 14:26
 */

//@EnableFeignClients(clients = xxxClient.class)
@MapperScan({
        "com.mhs.user.mapper"
})
//@ComponentScan("com.mhs.*")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
