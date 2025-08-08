package com.khaelor.posto_combustive.infrastructure.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipos_de_combustivel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TiposDeCombustivel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


	private Integer id;
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;
    @Column(name = "preco_por_litro", nullable = false)
    private BigDecimal precoPorLitro;
}
