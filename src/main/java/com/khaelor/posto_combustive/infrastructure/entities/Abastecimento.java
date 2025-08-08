package com.khaelor.posto_combustive.infrastructure.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "abastecimentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Builder

public class Abastecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "bomba_id", nullable = false)
    private BombasDeCombustivel bombaDeCombustivel;
    @Column(name = "data_abastecimento", nullable = false)
    private LocalDate dataAbastecimento;
    @Column(name = "valor_total", nullable = false)
    private BigDecimal valorTotal;
    @Column(name = "litros_abastecidos", nullable = false)
    private Long litrosAbastecidos;
    
}
