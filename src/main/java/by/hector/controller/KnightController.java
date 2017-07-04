package by.hector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author i.sukach
 */
@Controller
public class KnightController {

    @GetMapping("/run")
    public String run() {
        return "run";
    }
}
