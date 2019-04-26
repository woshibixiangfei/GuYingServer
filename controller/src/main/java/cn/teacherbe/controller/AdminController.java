package cn.teacherbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@Controller("adminController")
@RequestMapping("/admin")
public class AdminController {


    @RequestMapping(value = "/index")
    public String index() {
        System.out.println("------------");
        return "/login";
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public HashMap login() {
        System.out.println("1111111111111111111");
        HashMap map = new HashMap();
        map.put("test","success");
        return map;
    }
}