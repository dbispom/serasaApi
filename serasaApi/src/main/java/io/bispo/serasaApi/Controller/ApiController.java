package io.bispo.serasaApi.Controller;

import io.bispo.serasaApi.Model.Person;
import io.bispo.serasaApi.Service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private PessoaService pessoaService;

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
    public Optional<Person> getPessoaById(@PathVariable String id) {
        return pessoaService.getPessoaById(id);
    }

    @GetMapping("/pessoa")
    public List<Person> getPessoas() {
        return pessoaService.getPessoas();
    }

}
