package org.example.gitpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MacController {

    @GetMapping("/mac")
    public String myName() {
        return "My name is mac";
    }
}
