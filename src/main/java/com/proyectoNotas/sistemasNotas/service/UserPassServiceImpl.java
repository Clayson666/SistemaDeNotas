package com.proyectoNotas.sistemasNotas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.proyectoNotas.sistemasNotas.model.UserPass;
import com.proyectoNotas.sistemasNotas.repository.UserPassRepository;

@Service
public class UserPassServiceImpl implements UserPassService{

    @Autowired 
    private UserPassRepository userPassRepository;

    @Override
    public Optional<UserPass> findByUsername(String userName) {
        return userPassRepository.findByuserName(userName);
        
    }

    public boolean validateUser(String username, String password){

        Optional<UserPass> userOptional = userPassRepository.findByuserName(username);

        if(userOptional.isPresent()){
            UserPass user = userOptional.get();
            return user.getPass().equals(password);
        }

        return false;
    }

    public Integer findUserId(String username){
        Optional<UserPass> userOptional = userPassRepository.findByuserName(username);
        return userOptional.get().getId();

    }

    @Override
    public Integer findByIdteacher(Integer userId) {
        return userPassRepository.findByIdteacher(userId);
    }


    

    



}
