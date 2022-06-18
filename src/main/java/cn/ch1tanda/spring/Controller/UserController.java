package cn.ch1tanda.spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("getDefaultUser")
    public String getDefaultUser() {
        return "defaultUser";
    }
}
