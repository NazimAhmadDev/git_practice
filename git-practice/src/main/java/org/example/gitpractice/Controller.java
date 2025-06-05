package org.example.gitpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/nazim")
    public String myName() {
        return "Nazim Ahmad";
    }

    @GetMapping("/about")
    public String about() {
        return "About Git";
    }
}
