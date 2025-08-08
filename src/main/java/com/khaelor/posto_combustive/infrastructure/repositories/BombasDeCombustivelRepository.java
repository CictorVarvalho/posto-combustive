package com.khaelor.posto_combustive.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BombasDeCombustivelRepository extends JpaRepository<BombasDeCombustivelRepository, Integer> {
    
    // Custom query methods can be added here if needed
    // For example, to find by number:
    // Optional<BombasDeCombustivel> findByNumero(String numero);

}
