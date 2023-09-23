package com.usta.parcialnombre.utilities;

import com.usta.parcialnombre.entity.NombreEntity;
import com.usta.parcialnombre.repository.NombreRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultDataLoader {

    @Autowired
    private NombreRepository personaRepository;

    @PostConstruct
    public void init() {
        if (personaRepository.count() == 0) {

            NombreEntity nombre1 = new NombreEntity();
            nombre1.setNombre("Juan Sebastián Leal Pinzón");
            personaRepository.save(nombre1);

        }
    }

}