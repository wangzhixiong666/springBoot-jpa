package com.jnshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Mr_Wang
 * @Configuration,
 * 提到@Configuration就要提到他的搭档@Bean。
 * 使用这两个注解就可以创建一个简单的spring配置类，可以用来替代相应的xml配置文件。
 * @EnableAutoConfiguration,
 * 能够自动配置spring的上下文，试图猜测和配置你想要的bean类
 * @ComponentScan
 * 会自动扫描指定包下的全部标有@Component的类，并注册成bean，
 * 当然包括@Component下的子注解@Service,@Repository,@Controller。
 */
@SpringBootApplication
public class JpaThymeleafApplication  {
    public static void main(String[] args) {
       SpringApplication.run(JpaThymeleafApplication.class,args);
    }
}