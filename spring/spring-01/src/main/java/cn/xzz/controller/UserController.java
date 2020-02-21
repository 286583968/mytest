package cn.xzz.controller;


import cn.xzz.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @RequestMapping(path = "/testString")
    public String testString(Model model){
        User user = new User();
        user.setUsername("XXX");
        user.setAge(15);
        System.out.println("保存成功！");
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping(path = "/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("null");


        //编写请求转发的程序
        /*request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        return;*/

        //编写重定向的代码
        response.sendRedirect(request.getContextPath()+"/index.jsp");
        return;

    }

    @RequestMapping(path = "/testModleAndView")
    public ModelAndView testModleAndView(){
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername("XXX");
        user.setAge(15);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping(path = "/testAP")
    public String testAP(){
        /*转发
        System.out.println("forward");
        return "forward:/WEB-INF/pages/success.jsp";*/

        System.out.println("");
        return "redirect:/index.jsp";
    }


}
