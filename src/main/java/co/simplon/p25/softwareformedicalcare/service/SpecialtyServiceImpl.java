package co.simplon.p25.softwareformedicalcare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.softwareformedicalcare.entities.Specialty;
import co.simplon.p25.softwareformedicalcare.repositories.SpecialtyRepository;



@Service
public class SpecialtyServiceImpl implements SpecialtyService{
	private final SpecialtyRepository repository;
	
	public SpecialtyServiceImpl(SpecialtyRepository repository) {
		this.repository = repository;
	}
	
	public List<Specialty> getSpecialty(){
		return repository.findAllProjectedBy(Specialty.class);
	}
	
	
}
