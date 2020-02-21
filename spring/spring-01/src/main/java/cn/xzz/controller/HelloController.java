package cn.xzz.controller;


import cn.xzz.domain.Account;
import cn.xzz.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC!");
        return"success";
    }

    @RequestMapping(path = "/requestMapping")
    public String sayRequestMapping(String username,String password){
        System.out.println("Hello sayRequestMapping!");
        System.out.println(username);
        System.out.println(password);
        return"success";
    }

    @RequestMapping(path= "/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return"success";
    }

    @RequestMapping(path= "/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return"success";
    }

}
