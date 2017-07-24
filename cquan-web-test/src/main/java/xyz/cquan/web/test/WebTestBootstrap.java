package xyz.cquan.web.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Chenquanan on 2017/7/24.
 */
@SpringBootApplication(scanBasePackages = {"xyz.cquan.web"})
public class WebTestBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(WebTestBootstrap.class, args);
    }
}
