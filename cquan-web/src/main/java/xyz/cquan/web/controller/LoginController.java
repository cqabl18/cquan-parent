package xyz.cquan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chenquanan on 2017/7/24.
 */
@Controller
@RequestMapping
public class LoginController {

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
}
