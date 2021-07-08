package de.predic8.scooter;

import de.predic8.scooter.model.Rechnung;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface RechnungsRepository extends MongoRepository<Rechnung, String> {

    Optional<Rechnung> findById(String id);
    List<Rechnung> findByUserId(String id);

}
