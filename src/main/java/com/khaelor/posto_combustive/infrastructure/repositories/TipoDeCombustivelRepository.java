package com.khaelor.posto_combustive.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khaelor.posto_combustive.infrastructure.entities.TiposDeCombustivel;

public interface TipoDeCombustivelRepository extends JpaRepository<TiposDeCombustivel, Integer> {
    
    // Custom query methods can be added here if needed
    // For example, to find by name:
    // Optional<TiposDeCombustivel> findByNome(String nome);

}
