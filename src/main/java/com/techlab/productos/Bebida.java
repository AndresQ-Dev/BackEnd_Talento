package com.techlab.productos;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Bebida extends Producto {
    private Double litros;
    private Boolean esAlcoholica;

    public Bebida(String nombre, Double precio, Integer stock, Double litros, Boolean esAlcoholica) {
        super(nombre, precio, stock);
        this.litros = litros;
        this.esAlcoholica = esAlcoholica;
    }
}
