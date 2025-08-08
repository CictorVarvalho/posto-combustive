package com.khaelor.posto_combustive.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khaelor.posto_combustive.infrastructure.entities.Abastecimento;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Integer> {
    
    // Custom query methods can be added here if needed
    // For example, to find by a specific field:
    // Optional<Abastecimento> findByFieldName(String fieldName);

}
