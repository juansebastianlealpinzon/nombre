package com.usta.parcialnombre.service;

import com.usta.parcialnombre.repository.NombreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NombreServiceImplement implements INombreService {
    @Autowired
    private NombreRepository nombreRepository;

    @Override
    public String traerNombre() {
        return nombreRepository.traerNombre();
    }
}
