package com.proyectoNotas.sistemasNotas.service;

import java.util.Optional;



import com.proyectoNotas.sistemasNotas.model.UserPass;

public interface UserPassService {

    public Optional<UserPass> findByUsername(String userName);
    
    Integer findByIdteacher( Integer userId);
}
