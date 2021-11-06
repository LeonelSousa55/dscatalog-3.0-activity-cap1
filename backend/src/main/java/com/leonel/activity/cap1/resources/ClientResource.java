package com.leonel.activity.cap1.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonel.activity.cap1.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	ClientService service;
}
