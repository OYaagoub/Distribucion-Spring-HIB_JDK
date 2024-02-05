package com.yaagoub.services;

import com.yaagoub.entities.Cliente;
import com.yaagoub.entities.Shipment;
import com.yaagoub.repository.ImplementsDAO;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    ImplementsDAO dao;

    @Autowired
    Cliente clit;

    @Autowired
    Shipment shin;




}
