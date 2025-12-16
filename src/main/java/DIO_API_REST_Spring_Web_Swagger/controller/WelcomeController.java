package DIO_API_REST_Spring_Web_Swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Welcome to the DIO API REST Spring Web Swagger Application!";
    }
}
