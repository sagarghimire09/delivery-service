package com.example.delivery.service;

import com.example.delivery.model.DeliveryMode;
import com.example.delivery.model.DeliveryOption;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    private static final long speed = 60;

    public List<DeliveryOption> getDeliveryOptions(Double distance) {
        return List.of(
                DeliveryOption.builder().deliveryMode(DeliveryMode.PREMIUM.value).timeTaken(getTimeTaken(DeliveryMode.PREMIUM, distance)).build(),
                DeliveryOption.builder().deliveryMode(DeliveryMode.REGULAR.value).timeTaken(getTimeTaken(DeliveryMode.REGULAR, distance)).build()
        );
    }

    public Double getTimeTaken(DeliveryMode deliveryMode, Double distance) {
        switch (deliveryMode) {
            case PREMIUM:
                return distance/speed;
            case REGULAR:
                return distance/speed + 12 * (int) (distance/(12 * speed));
            default:
                return null;
        }
    }

}
