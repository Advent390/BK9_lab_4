package ua.edu.nuos.bk9_lab_4.data;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "car", schema = "public")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "brand", nullable = false, length = 50)
    private String brand;

    @Size(max = 50)
    @NotNull
    @Column(name = "model", nullable = false, length = 50)
    private String model;

    @NotNull
    @Column(name = "production_year", nullable = false)
    private Integer productionYear;

    @Size(max = 30)
    @NotNull
    @Column(name = "fuel_type", nullable = false, length = 30)
    private String fuelType;

    @Size(max = 30)
    @Column(name = "color", length = 30)
    private String color;

    @NotNull
    @Column(name = "mileage", nullable = false)
    private Integer mileage;

    @NotNull
    @Column(name = "price", nullable = false, precision = 12, scale = 2)
    private BigDecimal price;
}