package study.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Value("${SECRET_VALUE}")
    private String secretValue;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/profile")
    public String profile() {
        return "Active profile: " + activeProfile;
    }

    @GetMapping("/secret")
    public String secret() {
        return "Secret value: " + secretValue;
    }
}
