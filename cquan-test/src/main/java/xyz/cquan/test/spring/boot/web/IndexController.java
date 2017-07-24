package xyz.cquan.test.spring.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.cquan.test.spring.boot.model.MyThing;

/**
 * Created by Chenquanan on 2017/7/20.
 */
@RestController
@RequestMapping
public class IndexController {
    @RequestMapping("/")
    String home() {
        return "hello spring boot";
    }

    @RequestMapping("/thing")
    MyThing thing() {
        return new MyThing();
    }
}
