package com.upgrade.purchase_manager_api.domain.model;

import com.upgrade.purchase_manager_api.infraestructure.driven_adapters.postgres.purchase_orders.entities.OrderEntity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private Long itemId;

    private OrderEntity order;

    private String itemSku;

    private String itemDescription;

    private Integer quantity;

    private BigDecimal weight;

    private BigDecimal height;

    private BigDecimal width;

    private BigDecimal length;

    private BigDecimal volume;
}
