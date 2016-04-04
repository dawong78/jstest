package js.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dawong
 */
@RestController()
@RequestMapping("/rest")
public class JsRestController {
    
    @RequestMapping(value = "/message")
    public String message(@RequestParam String name) {
        return "Hi, " + name;
    }

}
