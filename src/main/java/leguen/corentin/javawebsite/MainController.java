package leguen.corentin.javawebsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String homepage(
            @RequestParam(value = "name", required = false, defaultValue = "unknown")
                    String name, Model model) {
        model.addAttribute("name", name);
        return "homepage";
    }
}
