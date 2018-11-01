package home.example.dogshow.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomePageController {

    @Value("${home.message:test}")
    private String message = "Hello World!";

    @RequestMapping("/home")
    public String test(Map<String, Object>model) {
        model.put("message", this.message);
        return "home";
    }

}
