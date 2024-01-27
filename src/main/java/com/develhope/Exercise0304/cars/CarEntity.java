package com.develhope.Exercise0304.cars;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "cars")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "model_name", nullable = false)
    private String modelName;
    @Column(name = "current_price", nullable = true)
    private BigDecimal currentPrice;
    @Column(name = "serial_number", nullable = false)
    private String serialNumber;
}
