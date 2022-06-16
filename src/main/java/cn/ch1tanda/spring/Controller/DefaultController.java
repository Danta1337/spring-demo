package cn.ch1tanda.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

    @RequestMapping(path = "/ping")
    @ResponseBody
    public String ping () {
        return "pong";
    }

    @RequestMapping(path = "/index")
    public String index(Model model) {
        model.addAttribute("userName", "Jiaqi Li");
        return "index";
    }
}
