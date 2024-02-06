package com.yaagoub.entities;

import com.yaagoub.validations.ClientDataStatusValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "clientesData")
@Scope("prototype")
public class ClientData {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clienteData_seq")
    @SequenceGenerator(name = "clienteData_seq", sequenceName = "clienteData_seq", allocationSize = 111111)
    @Id
    private long id;
    private String province;
    @Min(5)
    @Max(10)
    private int codePostal;
    private String country;
    private String city;
    private String address;
    @Pattern(regexp = "^(\\+\\d{1,4}[-.\\s]?)?\\(\\d{1,4}\\)?[-.\\s]?\\d{1,10}$",
            message = "Number not valid")
    private String phone;
    @ClientDataStatusValidator
    private String status;
    @ManyToOne
    private Client client;

    public ClientData() {
    }

    public ClientData(long id, String province, int codePostal, String country, String city, String address, String phone, Client client) {
        this.id = id;
        this.province = province;
        this.codePostal = codePostal;
        this.country = country;
        this.city = city;
        this.address = address;

        this.phone = phone;
        this.client = client;
    }

    public ClientData(String province, int codePostal, String country, String city, String address, String phone, Client client) {
        this.province = province;
        this.codePostal = codePostal;
        this.country = country;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.client = client;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Client getCliente() {
        return client;
    }

    public void setCliente(Client client) {
        this.client = client;
    }
}
