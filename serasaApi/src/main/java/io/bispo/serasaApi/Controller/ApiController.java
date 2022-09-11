package io.bispo.serasaApi.Controller;

import org.springframework.web.bind.annotation.*;

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
    public void getPessoaById(@PathVariable String id) {
    }

    @GetMapping("/pessoa")
    public void getPessoa() {
    }

}
