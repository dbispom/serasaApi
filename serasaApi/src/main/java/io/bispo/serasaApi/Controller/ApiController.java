package io.bispo.serasaApi.Controller;

import io.bispo.serasaApi.Model.Person;
import io.bispo.serasaApi.Model.Score;
import io.bispo.serasaApi.Service.PessoaService;
import io.bispo.serasaApi.Service.ScoreService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private PessoaService pessoaService;
    private ScoreService scoreService;

    @PostMapping("/pessoa")
    public void postPessoa() {
    }

    @PostMapping("/afinidade")
    public void postAfinidade() {
    }

    @PostMapping("/score")
    public ResponseEntity<?> postScore(@RequestBody Map<String,
            String> payload) throws Exception {
        return scoreService.saveNewScore(payload);
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
