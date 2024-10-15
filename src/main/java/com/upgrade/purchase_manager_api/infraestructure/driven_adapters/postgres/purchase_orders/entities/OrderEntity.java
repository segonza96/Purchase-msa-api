package com.upgrade.purchase_manager_api.infraestructure.driven_adapters.postgres.purchase_orders.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "order")
@EntityListeners(AuditingEntityListener.class)
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "pickup_city", nullable = false)
    private String pickupCity;

    @Column(name = "pickup_location")
    private String pickupLocation;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "dispatch_date", nullable = false)
    private LocalDate dispatchDate;

    @Column(name = "delivery_date", nullable = false)
    private LocalDate deliveryDate;

    @Column(name = "external_order_identifier", nullable = false)
    private BigInteger externalOrderIdentifier;

    @Column(name = "destination_city", nullable = false)
    private String destinationCity;

    @Column(name = "delivery_address", nullable = false)
    private String deliveryAddress;

    @Column(name = "declared_value")
    private BigDecimal declaredValue;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductEntity> orderItems;
}
