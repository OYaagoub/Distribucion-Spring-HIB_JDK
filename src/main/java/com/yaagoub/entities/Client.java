package com.yaagoub.entities;

import com.yaagoub.validations.PermissionValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Entity
@Table(name = "clientes")
@Scope("prototype")
public class Client {
    @NotNull(message = "Name cannot be null")
    @Id
    private String docDniNif;
    @Pattern(regexp = "^[A-Za-zÁÉÍÓÚáéíóúüÜ]+( [A-Za-zÁÉÍÓÚáéíóúüÜ]+)?( [A-Za-zÁÉÍÓÚáéíóúüÜ]+)?$",
            message = "Invalid name format. Use 'firstname firstlastname secondlastname' or 'firstname firstlastname' or 'firstname firstlastname'")
    private String fullName;
    @Email(message = "Invalid email format")
    private String email;
    private String password;
    @PermissionValidator
    private String ClientType;

    @OneToMany
    private ArrayList<Shipment> shipments = new ArrayList<>();
    @OneToMany(mappedBy = "client")
    private ArrayList<ClientData> clientData = new ArrayList<>();

    public Client() {
    }

    public Client(String docDniNif, String fullName, String email, String password, String ClientType, ArrayList<Shipment> shipments, ArrayList<ClientData> clientData) {
        this.docDniNif = docDniNif;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.ClientType = ClientType;
        this.shipments = shipments;
        this.clientData = clientData;
    }

    public Client(String docDniNif, String fullName, String email, String password, String ClientType) {
        this.docDniNif = docDniNif;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.ClientType = ClientType;
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

    public String getClientType() {
        return ClientType;
    }

    public void setClientType(String typeOfCliente) {
        this.ClientType = typeOfCliente;
    }

    public ArrayList<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(ArrayList<Shipment> shipments) {
        this.shipments = shipments;
    }

    public ArrayList<ClientData> getClienteData() {
        return clientData;
    }

    public void setClienteData(ArrayList<ClientData> clientData) {
        this.clientData = clientData;
    }
}
