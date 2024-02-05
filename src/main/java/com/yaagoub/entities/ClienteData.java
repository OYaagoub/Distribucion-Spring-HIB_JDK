package com.yaagoub.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "clientesData")
@Scope("prototype")
public class ClienteData {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clienteData_seq")
    @SequenceGenerator(name = "clienteData_seq", sequenceName = "clienteData_seq", allocationSize = 111111)
    @Id
    private long id;
    private String province;
    private int codePostal;
    private String country;
    private String address;
    private String phone;
    @ManyToOne
    private Cliente cliente;

    public ClienteData() {
    }

    public ClienteData(long id, String province, int codePostal, String country, String address, String phone, Cliente cliente) {
        this.id = id;
        this.province = province;
        this.codePostal = codePostal;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.cliente = cliente;
    }

    public ClienteData(String province, int codePostal, String country, String address, String phone, Cliente cliente) {
        this.province = province;
        this.codePostal = codePostal;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
