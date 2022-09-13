package io.bispo.serasaApi.Repository;

import io.bispo.serasaApi.Model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
