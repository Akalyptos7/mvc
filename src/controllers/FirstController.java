package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @RequestMapping(value = "home/{id}.htm", method = RequestMethod.GET)
    public String doit(ModelMap m, @PathVariable String id){
//        m.put("lala", id);
        m.addAttribute("name", id);
        m.addAttribute("test", id);
        return "home";
    }

    @RequestMapping(value ="home1.htm", method = RequestMethod.GET)
    public String doit1 (ModelMap m1, @RequestParam(value = "type", required = false, defaultValue = "all") String type){
        m1.addAttribute("message", type);
        return "home1";
    }

    @RequestMapping(value = "showform.htm", method = RequestMethod.GET)
    public String doit3(ModelMap m){
        return "form";
    }

    @RequestMapping (value = "submitform.htm", method = RequestMethod.POST)
    public String doit4 (ModelMap map, @RequestParam(value = "firstname" , required = false, defaultValue = "all") String sumbitF,
                         @RequestParam(value = "lastname", required = false, defaultValue = "all" )String sumbitL) {
        map.addAttribute("fname", sumbitF);
        map.addAttribute("lname", sumbitL);
        System.out.println(sumbitF + " " + sumbitL);
        return "home";
    }
}
