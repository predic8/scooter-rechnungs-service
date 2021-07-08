package de.predic8.scooter.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class RueckgabeDTO {

    String userId;
    String fahrtId;
    String scooterId;
    LocalDateTime rueckgabe;

    public RueckgabeDTO() {
        rueckgabe = LocalDateTime.now();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getScooterId() {
        return scooterId;
    }

    public void setScooterId(String scooterId) {
        this.scooterId = scooterId;
    }

    public LocalDateTime getRueckgabe() {
        return rueckgabe;
    }

    public void setRueckgabe(LocalDateTime rueckgabe) {
        this.rueckgabe = rueckgabe;
    }

    public String getFahrtId() {
        return fahrtId;
    }

    public void setFahrtId(String fahrtId) {
        this.fahrtId = fahrtId;
    }

}
