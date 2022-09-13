package io.bispo.serasaApi.Service;

import io.bispo.serasaApi.Model.Score;
import io.bispo.serasaApi.Repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepo;

    public ResponseEntity<?> saveNewScore(Map<String, String> payload) {
        try {
            Score newScore = new Score(payload.get("scoreDescricao"), Integer.getInteger(payload.get("inicial")),
                    Integer.getInteger(payload.get("final")) );
            scoreRepo.save(newScore);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
