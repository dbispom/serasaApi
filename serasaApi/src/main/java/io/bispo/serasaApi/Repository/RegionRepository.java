package io.bispo.serasaApi.Repository;

import io.bispo.serasaApi.Model.Region;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegionRepository extends MongoRepository<Region, String> {
}
