package com.yaagoub.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Entity
@Table(name = "liveLocations")
@Scope("prototype")
public class LiveLocation {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipment_seq")
    @SequenceGenerator(name = "shipment_seq", sequenceName = "shipment_seq", allocationSize = 111111)
    @Id
    private long id;
    private String location;
    private Date date;
    @ManyToOne
    private  Shipment shipment;

    public LiveLocation() {
    }

    public LiveLocation(long id, String location, Date date, Shipment shipment) {
        this.id = id;
        this.location = location;
        this.date = date;
        this.shipment = shipment;
    }

    public LiveLocation(String location, Date date, Shipment shipment) {
        this.location = location;
        this.date = date;
        this.shipment = shipment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}
