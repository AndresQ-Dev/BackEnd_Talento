package com.techlab.productos;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Comida extends Producto {
    private LocalDate fechaVencimiento;
    private Double calorias;

    public Comida(String nombre, Double precio, Integer stock, LocalDate fechaVencimiento, Double calorias) {
        super(nombre, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
        this.calorias = calorias;
    }
}
