package com.project.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.Repository.VoterRepository;

public class ServiceImplements implements ServiceInterface {

	@Autowired
	private VoterRepository repository;
}
