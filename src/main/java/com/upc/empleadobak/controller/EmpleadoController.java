package com.upc.empleadobak.controller;

import com.upc.empleadobak.model.Empleado;
import com.upc.empleadobak.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/empleados")
    ResponseEntity<List<Empleado>> listAll () {
        return new ResponseEntity<List<Empleado>>(empleadoService.listAll(), HttpStatus.OK);
    }
    @PostMapping("/empleados")
    ResponseEntity<Empleado> insert (@RequestBody Empleado nuevoEmpleado) {
        return new ResponseEntity<Empleado>(empleadoService.insert(nuevoEmpleado), HttpStatus.CREATED);
    }
}
