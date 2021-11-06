package com.leonel.activity.cap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonel.activity.cap1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
