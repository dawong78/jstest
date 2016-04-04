package js.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dawong
 */
@Controller
public class JsController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
