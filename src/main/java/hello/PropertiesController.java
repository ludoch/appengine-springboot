package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PropertiesController {

    @RequestMapping("/properties")
    public String properties(
            @RequestParam(value="name", required=false, defaultValue="World") String name, 
            Model model) {
        model.addAttribute("properties", System.getProperties());
        model.addAttribute("env", System.getenv());
        return "properties";
    }

}