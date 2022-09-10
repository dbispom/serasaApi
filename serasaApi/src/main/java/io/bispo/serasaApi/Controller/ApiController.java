package io.bispo.serasaApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/pessoa")
    public void postPessoa() {
    }

    @PostMapping("/afinidade")
    public void postAfinidade() {
    }

    @PostMapping("/score")
    public void postScore() {
    }

    @GetMapping("/pessoa/{id}")
    public void getPessoaById(int id) {
    }

    @GetMapping("/pessoa")
    public void getPessoa() {}

}
