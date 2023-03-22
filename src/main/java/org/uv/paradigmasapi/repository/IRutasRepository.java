package org.uv.paradigmasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uv.paradigmasapi.entities.Ruta;

/* @author miran */

@Repository

public interface IRutasRepository extends JpaRepository<Ruta, Long>{
    
}
