package com.upgrade.purchase_manager_api.domain.model;

import com.upgrade.purchase_manager_api.infraestructure.driven_adapters.postgres.purchase_orders.entities.ProductEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class Order {
    private Long orderId;

    private String pickupCity;

    private String pickupLocation;

    private LocalDate orderDate;

    private LocalDate saleDate;

    private LocalDate dispatchDate;

    private String dispatchDay;

    private LocalDate deliveryDate;

    private LocalDate deliveryPromiseDate;

    private String destinationCity;

    private String deliveryAddress;

    private BigDecimal declaredValue;

    private List<ProductEntity> orderItems;
}
