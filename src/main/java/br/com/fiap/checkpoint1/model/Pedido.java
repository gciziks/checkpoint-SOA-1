package br.com.fiap.checkpoint1.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String clienteNome;

    @Column(nullable = false)
    private LocalDate dataPedido = LocalDate.now();

    @Column(nullable = false)
    private double valorTotal ;

    @PrePersist
    public void prePersist() {
        if (valorTotal  < 0) {
            throw new IllegalArgumentException("Total não pode ser negativo.");
        }
    }
}
