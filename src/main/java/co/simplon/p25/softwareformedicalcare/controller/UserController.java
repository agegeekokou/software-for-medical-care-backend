package co.simplon.p25.softwareformedicalcare.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.softwareformedicalcare.dtos.UserCreate;
import co.simplon.p25.softwareformedicalcare.dtos.UserLogin;
import co.simplon.p25.softwareformedicalcare.entities.User;
import co.simplon.p25.softwareformedicalcare.security.Jwt;
import co.simplon.p25.softwareformedicalcare.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
private final UserService service;
	
	public UserController(UserService service){
		this.service = service;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody UserCreate inputs) {
		service.create(inputs);
	}
	@PostMapping("/sign-in")
	public Jwt signIn(@RequestBody UserLogin inputs) {
		return service.signIn(inputs);
	}
}
