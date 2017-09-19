package spring.in.action.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shliangyan on 2017/9/19.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
