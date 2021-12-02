package com.example.delivery.controller;

import com.example.delivery.model.DeliveryOption;
import com.example.delivery.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping("/delivery/options")
    public ResponseEntity<List<DeliveryOption>> getDeliveryOptions(@RequestParam Double distance) {
        List<DeliveryOption> optionList = deliveryService.getDeliveryOptions(distance);
        return new ResponseEntity<>(optionList, HttpStatus.OK);
    }
}
