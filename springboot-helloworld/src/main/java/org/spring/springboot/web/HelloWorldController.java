package org.spring.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping("/testGit")
    public String sayHelloGit() {
        return "Hello,World testGit!";
    }

    @RequestMapping("/begin")
    public String sayHelloBegin() {
        return "Hello,World Begin!";
    }
}
