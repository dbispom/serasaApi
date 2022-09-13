package io.bispo.serasaApi.Repository;

import io.bispo.serasaApi.Model.Score;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScoreRepository extends MongoRepository<Score, String> {
}
