package com.project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.VoterRepository;
@Service
public class ServiceImplements implements ServiceInterface {

	@Autowired
	private VoterRepository repository;
}
