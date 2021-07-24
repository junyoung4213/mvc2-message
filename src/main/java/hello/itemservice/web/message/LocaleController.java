package hello.itemservice.web.message;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocaleController {

    @GetMapping("/international")
    public String changeLocation() {
        return "redirect:/message/items";
    }
}
