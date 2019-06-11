package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String userInfo(Model model){
        List<User> users = userService.querUser();
        model.addAttribute("users",users);
        return "index";
    }

    @RequestMapping("/add")
    public String goAdd(){
        return "add";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        System.out.println(user);
        userService.addUser(user);
        return "redirect:/";
    }
    @RequestMapping(value = "/user/delete",method = RequestMethod.GET)
    @ResponseBody
    public Map delete(String name, Model model){
        System.out.println(name);
        Map<String,Object> map = new HashMap<>();
        map.put("delect",1);
        return map;
    }
    @RequestMapping("/modify")
    public String modifyUser(String name){
    return "add";
    }
}
