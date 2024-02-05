package com.yaagoub.entities;

import jakarta.persistence.*;
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
    private String title;
    private double mass;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "docReceiver")
    private Cliente receiver;

    @ManyToOne
    @JoinColumn(name = "docSender")
    private Cliente sender;

    @OneToMany(mappedBy = "shipment")
    private ArrayList<LiveLocation> liveLocations=new ArrayList<>();

    public Shipment() {
    }

    public Shipment(long id, String title, double mass, double amount, Cliente receiver, Cliente sender, ArrayList<LiveLocation> liveLocations) {
        this.id = id;
        this.title = title;
        this.mass = mass;
        this.amount = amount;
        this.receiver = receiver;
        this.sender = sender;
        this.liveLocations = liveLocations;
    }

    public Shipment(String title, double mass, double amount, Cliente receiver, Cliente sender) {
        this.title = title;
        this.mass = mass;
        this.amount = amount;
        this.receiver = receiver;
        this.sender = sender;
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

    public Cliente getReceiver() {
        return receiver;
    }

    public void setReceiver(Cliente receiver) {
        this.receiver = receiver;
    }

    public Cliente getSender() {
        return sender;
    }

    public void setSender(Cliente sender) {
        this.sender = sender;
    }

    public ArrayList<LiveLocation> getLiveLocations() {
        return liveLocations;
    }

    public void setLiveLocations(ArrayList<LiveLocation> liveLocations) {
        this.liveLocations = liveLocations;
    }
}
