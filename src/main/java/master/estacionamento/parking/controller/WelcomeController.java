package master.estacionamento.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "<font style='font-family: impact; font-size: 20px;'> Seja bem vindo! Vamos começar nosso APP.</font>";
    }
}
