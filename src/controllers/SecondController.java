package controllers;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecondController {

    @RequestMapping(value = "showuserform.htm", method = RequestMethod.GET)
    public String doit5(ModelMap map) {
        User aka = new User();
        map.addAttribute("emUser" , aka);

        return "userForm";
    }

    @RequestMapping(value = "submituserform.htm", method = RequestMethod.POST)
    public String doit6(ModelMap map , @ModelAttribute ("emUser") User user) {
        map.addAttribute("fulluser", user);

        System.out.println(user.getFirstname() + " " + user.getLastname());

        return "home";
    }



}
