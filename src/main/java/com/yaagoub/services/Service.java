package com.yaagoub.services;

import com.yaagoub.entities.Client;
import com.yaagoub.entities.Shipment;
import com.yaagoub.repository.ImplementsDAO;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    ImplementsDAO dao;

    @Autowired
    Client clit;

    @Autowired
    Shipment shin;




}
