package cn.xzz.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/users")
public class UsersController {

    @RequestMapping(path = "/testAjax")
    public String testAjax(@RequestBody String body){

        System.out.println("haha");
        System.out.println(body);

        return "success";
    }
}
