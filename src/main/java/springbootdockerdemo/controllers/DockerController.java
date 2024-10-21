package springbootdockerdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/")
    public String index() {
        return "Hello from test service java";
    }

    @GetMapping("/docker")
    public String dockerDemo(){
        return "Hello not from test service java";
    }
}
