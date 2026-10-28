package ua.edu.nuos.bk9_lab_4.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDto implements Serializable {
    Integer id;

    @NotNull
    @Size(max = 50)
    String brand;

    @NotNull
    @Size(max = 50)
    String model;

    @NotNull
    Integer productionYear;

    @NotNull
    @Size(max = 30)
    String fuelType;

    @Size(max = 30)
    String color;

    @NotNull
    Integer mileage;

    @NotNull
    BigDecimal price;
}