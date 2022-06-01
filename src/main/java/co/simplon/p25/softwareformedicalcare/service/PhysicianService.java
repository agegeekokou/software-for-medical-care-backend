package co.simplon.p25.softwareformedicalcare.service;

import java.util.List;
import java.util.Optional;

import co.simplon.p25.softwareformedicalcare.dtos.PhysicianCreate;
import co.simplon.p25.softwareformedicalcare.dtos.PhysicianUpdate;
import co.simplon.p25.softwareformedicalcare.entities.Physician;

public interface PhysicianService {
	void create(PhysicianCreate inputs);
	
	List<Physician> getPhysician();
	
	Optional<Physician> getById(Long id);
	
	//Object findAll();

	Physician updatePhysician(PhysicianCreate inputs);

	Physician updatePhysicianById(Long id);

	void updatePhysicianById(Long id, PhysicianUpdate physician);
	
	void deletePhysicianById(Long id);
	
}
