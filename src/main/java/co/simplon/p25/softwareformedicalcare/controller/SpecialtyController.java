package co.simplon.p25.softwareformedicalcare.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.softwareformedicalcare.entities.Specialty;
import co.simplon.p25.softwareformedicalcare.service.SpecialtyService;

@RestController
@RequestMapping("/specialties")
public class SpecialtyController {
	
	private final SpecialtyService service;

	public SpecialtyController(SpecialtyService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Specialty> getSpecialty(){
		return service.getSpecialty();
	}
	
}

