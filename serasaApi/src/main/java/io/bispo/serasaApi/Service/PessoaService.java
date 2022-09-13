package io.bispo.serasaApi.Service;

import io.bispo.serasaApi.Model.Person;
import io.bispo.serasaApi.Model.Score;
import io.bispo.serasaApi.Repository.PersonRepository;
import io.bispo.serasaApi.Repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PessoaService {

    @Autowired
    private PersonRepository personRepo;

    public List<Person> getPessoas() {
        return personRepo.findAll();
    }

    public Optional<Person> getPessoaById(String id) {
        return personRepo.findById(id);
    }

}
