package com.leonel.activity.cap1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonel.activity.cap1.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository repository;
}
