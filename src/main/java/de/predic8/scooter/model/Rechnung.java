package de.predic8.scooter.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Rechnung {

    @Id
    String id = UUID.randomUUID().toString();

    String userId;
    String amount;

    public Rechnung() {
    }

    public Rechnung(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Rechnung{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
