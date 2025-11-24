package com.techlab.pedidos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime fecha;
    private Double total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LineaPedido> lineas = new ArrayList<>();

    public void agregarLinea(LineaPedido linea) {
        lineas.add(linea);
        calcularTotal();
    }

    public void calcularTotal() {
        this.total = lineas.stream()
                .mapToDouble(LineaPedido::getSubtotal)
                .sum();
    }

    @PrePersist
    public void prePersist() {
        this.fecha = LocalDateTime.now();
        calcularTotal();
    }
}
