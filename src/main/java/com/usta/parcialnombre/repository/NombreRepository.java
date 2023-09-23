package com.usta.parcialnombre.repository;

import com.usta.parcialnombre.entity.NombreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NombreRepository extends JpaRepository<NombreEntity, Long> {
    @Query(value = "SELECT n.nombre FROM nombres n WHERE n.id_nombre = 1;", nativeQuery = true)
    public String traerNombre();
}
