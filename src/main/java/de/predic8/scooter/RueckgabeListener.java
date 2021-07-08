package de.predic8.scooter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.predic8.scooter.model.Rechnung;
import de.predic8.scooter.model.RueckgabeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RueckgabeListener {

    @Autowired
    ObjectMapper om;

    @Autowired
    RechnungsRepository repo;

    Random rand = new Random();

    @KafkaListener(topics = "scooter.rueckgabe")
    public void rueckgabeListener(String rueckgabe) throws JsonProcessingException {

        RueckgabeDTO rueckgabeDTO = om.readValue(rueckgabe, RueckgabeDTO.class);
        Rechnung r = new Rechnung(rueckgabeDTO.getUserId());
        r.setAmount(""+rand.nextInt(20));
        repo.save(r);
    }

}
