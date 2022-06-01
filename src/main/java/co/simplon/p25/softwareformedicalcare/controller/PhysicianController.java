package co.simplon.p25.softwareformedicalcare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.softwareformedicalcare.dtos.PhysicianCreate;
import co.simplon.p25.softwareformedicalcare.dtos.PhysicianUpdate;
import co.simplon.p25.softwareformedicalcare.entities.Physician;
import co.simplon.p25.softwareformedicalcare.service.PhysicianService;


@RestController
@RequestMapping("/physicians")
public class PhysicianController {
	
	private final PhysicianService service;
	
	public PhysicianController(PhysicianService service){
		this.service = service;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody PhysicianCreate inputs) {
		service.create(inputs);
	}
	
	
	@GetMapping
	public List<Physician> getPhysician(){
		return service.getPhysician();
	}
	
	@GetMapping("/{id}")
	public Optional<Physician> getPhysicianById(@PathVariable("id") Long id) {
		return service.getById(id);
	}
	
	@PutMapping("/{id}")
	public void updatePhysician(@PathVariable Long id, @RequestBody PhysicianUpdate physician) {
		service.updatePhysicianById(id, physician);
	}
	
	@DeleteMapping("/{id}")
	public void deletePhysician(@PathVariable("id") Long id) {
		service.deletePhysicianById(id);
	}
	
}
