/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.carlos.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.carlos.*")
@ComponentScan(basePackages = {"com.carlos.*"})
@EntityScan("com.carlos.*")
public class DesafioTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesafioTwoApplication.class, args);
    }
}
