package de.predic8.scooter;

import de.predic8.scooter.model.Rechnung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RechnungsAPI {

    @Autowired
    RechnungsRepository repo;

    @GetMapping("/rechnung/{id}")
    public Object getRechnungForId(@PathVariable String id){
        List<Rechnung> byId = repo.findByUserId(id);

        if (byId.isEmpty())
            return ResponseEntity.notFound();

        return ResponseEntity.ok(byId);
    }

}
