package com.AdrianPeiro.TaulaSimple.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PaisRepository extends JpaRepository<Pais,Long> {
}
