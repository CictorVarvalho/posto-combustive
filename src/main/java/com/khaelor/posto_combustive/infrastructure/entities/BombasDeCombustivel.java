package com.khaelor.posto_combustive.infrastructure.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bombas_de_combustivel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BombasDeCombustivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero", nullable = false, unique = true)
    private String numero;
    
    @ManyToOne
    @JoinColumn(name = "combustivel_id", nullable = false)
    private TiposDeCombustivel tiposDeCombustivel;
}
