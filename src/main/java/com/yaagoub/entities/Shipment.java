package com.yaagoub.entities;

import com.yaagoub.validations.ShipmentStatusValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Entity
@Table(name = "shipments")
@Scope("prototype")
public class Shipment {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipment_seq")
    @SequenceGenerator(name = "shipment_seq", sequenceName = "shipment_seq", allocationSize = 111111)
    @Id
    private long id;
    @Size(max = 100, min = 20,message = "Title between 20 and 100 Characters")
    private String title;
    @Min(value = 0, message = "Value must be greater than or equal to 0.23")
    private double mass;
    @Min(value = 0, message = "Value must be greater than or equal to 0.23")
    private double amount;
    @ShipmentStatusValidator
    private String status;

    @ManyToOne
    @JoinColumn(name = "docReceiver")
    private Client receiver;

    @ManyToOne
    @JoinColumn(name = "docSender")
    private Client sender;

    @OneToMany(mappedBy = "shipment")
    private ArrayList<LiveLocation> liveLocations=new ArrayList<>();

    public Shipment() {
    }

    public Shipment(long id, String title, double mass, double amount, String status, Client receiver, Client sender, ArrayList<LiveLocation> liveLocations) {
        this.id = id;
        this.title = title;
        this.mass = mass;
        this.amount = amount;
        this.status = status;
        this.receiver = receiver;
        this.sender = sender;
        this.liveLocations = liveLocations;
    }

    public Shipment(String title, double mass, double amount, String status, Client receiver, Client sender, ArrayList<LiveLocation> liveLocations) {
        this.title = title;
        this.mass = mass;
        this.amount = amount;
        this.status = status;
        this.receiver = receiver;
        this.sender = sender;
        this.liveLocations = liveLocations;
    }

    public Shipment(long id, String title, double mass, double amount, Client receiver, Client sender, ArrayList<LiveLocation> liveLocations) {
        this.id = id;
        this.title = title;
        this.mass = mass;
        this.amount = amount;
        this.receiver = receiver;
        this.sender = sender;
        this.liveLocations = liveLocations;
    }

    public Shipment(String title, double mass, double amount, Client receiver, Client sender) {
        this.title = title;
        this.mass = mass;
        this.amount = amount;
        this.receiver = receiver;
        this.sender = sender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Client getReceiver() {
        return receiver;
    }

    public void setReceiver(Client receiver) {
        this.receiver = receiver;
    }

    public Client getSender() {
        return sender;
    }

    public void setSender(Client sender) {
        this.sender = sender;
    }

    public ArrayList<LiveLocation> getLiveLocations() {
        return liveLocations;
    }

    public void setLiveLocations(ArrayList<LiveLocation> liveLocations) {
        this.liveLocations = liveLocations;
    }
}
