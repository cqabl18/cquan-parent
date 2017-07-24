package xyz.cquan.test.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chenquanan on 2017/7/18.
 */
@SpringBootApplication
public class Bootstrap {
    @RequestMapping(value = "/")
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
