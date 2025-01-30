package com.proyectoNotas.sistemasNotas.repository;

import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.proyectoNotas.sistemasNotas.model.UserPass;

@Repository
public interface UserPassRepository extends JpaRepository <UserPass,Integer>{


    Optional<UserPass> findByuserName(String userName);

    @Query("SELECT u.teacher.id FROM UserPass u WHERE u.id=:userId")
    Integer findByIdteacher(@Param("userId") Integer userId);
    
}
