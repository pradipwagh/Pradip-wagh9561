package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.Services.ServiceInterface;

@RestController
public class Controll {

	@Autowired
	private  ServiceInterface ser;
}
