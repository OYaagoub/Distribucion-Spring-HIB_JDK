package com.yaagoub.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Entity
@Table(name = "clientes")
@Scope("prototype")
public class Cliente {
    @Id
    private String docDniNif;
    private String fullName;
    private String email;
    private String password;
    private String typeOfCliente;

    @OneToMany
    private ArrayList<Shipment> shipments =new ArrayList<>();
    @OneToMany(mappedBy = "cliente")
    private ArrayList<ClienteData> clienteData =new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String docDniNif, String fullName, String email, String password, String typeOfCliente, ArrayList<Shipment> shipments, ArrayList<ClienteData> clienteData) {
        this.docDniNif = docDniNif;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.typeOfCliente = typeOfCliente;
        this.shipments = shipments;
        this.clienteData = clienteData;
    }

    public Cliente(String docDniNif, String fullName, String email, String password, String typeOfCliente) {
        this.docDniNif = docDniNif;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.typeOfCliente = typeOfCliente;
    }

    public String getDocDniNif() {
        return docDniNif;
    }

    public void setDocDniNif(String docDniNif) {
        this.docDniNif = docDniNif;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeOfCliente() {
        return typeOfCliente;
    }

    public void setTypeOfCliente(String typeOfCliente) {
        this.typeOfCliente = typeOfCliente;
    }

    public ArrayList<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(ArrayList<Shipment> shipments) {
        this.shipments = shipments;
    }

    public ArrayList<ClienteData> getClienteData() {
        return clienteData;
    }

    public void setClienteData(ArrayList<ClienteData> clienteData) {
        this.clienteData = clienteData;
    }
}
