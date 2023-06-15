package com.upc.empleadobak.repository;

import com.upc.empleadobak.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
