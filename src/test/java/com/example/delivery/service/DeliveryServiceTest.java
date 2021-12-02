package com.example.delivery.service;

import com.example.delivery.model.DeliveryMode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeliveryServiceTest {
    @Test
    public void getTimeTaken() {
        DeliveryService deliveryService = new DeliveryService();
        Double actualDistance = deliveryService.getTimeTaken(DeliveryMode.REGULAR, 2500.0);
        Assertions.assertEquals(77.66, actualDistance, 0.01);
    }
}
