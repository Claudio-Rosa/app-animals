package com.claudiorosa.appanimals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claudiorosa.appanimals.entity.CachorroEntity;
import com.claudiorosa.appanimals.repository.CachorroRepository;

@RestController
@RequestMapping("/cachorro")
public class CachorroController {
	
	@Autowired
	public CachorroRepository cachorrorepository;
	
	@GetMapping
	public List<CachorroEntity> getCachorro() {
		List<CachorroEntity> response = cachorrorepository.findAll();
		
		return response;
	}
	

}
