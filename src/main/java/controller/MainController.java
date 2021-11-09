package controller;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class MainController {

    /*//LOGIN
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    //PAGINA PRINCIPAL
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/falenciaPessoal")
    public String home() {
        return "home";
    }*/


    //PAGINAS SIMPLES
    @GetMapping("/error")
    public String erro() {
        return "error";
    }

   /* @GetMapping("/changelog")
    public String changelog() {
        return "changelog";
    }*/

}
