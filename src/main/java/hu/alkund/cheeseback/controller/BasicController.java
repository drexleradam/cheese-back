package hu.alkund.cheeseback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/say_hello")
    public String sayHelloWorld(){
        return "Hello World!";
    }

}
