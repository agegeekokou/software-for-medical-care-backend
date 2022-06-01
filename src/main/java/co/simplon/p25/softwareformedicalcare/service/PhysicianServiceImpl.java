package co.simplon.p25.softwareformedicalcare.service;



import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import co.simplon.p25.softwareformedicalcare.dtos.PhysicianCreate;
import co.simplon.p25.softwareformedicalcare.dtos.PhysicianUpdate;
import co.simplon.p25.softwareformedicalcare.entities.Physician;
import co.simplon.p25.softwareformedicalcare.entities.Specialty;
import co.simplon.p25.softwareformedicalcare.repositories.PhysicianRepository;
import co.simplon.p25.softwareformedicalcare.repositories.SpecialtyRepository;

@Service
public class PhysicianServiceImpl implements PhysicianService{
	private final PhysicianRepository repository;
	private final SpecialtyRepository specialtyRepository;
	
	public PhysicianServiceImpl(PhysicianRepository repository, SpecialtyRepository specialtyRepository) {
		this.repository = repository;
		this.specialtyRepository = specialtyRepository;
		}
	
	@Transactional
	@Override
	public void create(PhysicianCreate inputs) {
		Physician physician = new Physician();
		physician.setFirstname(inputs.getFirstname());
		physician.setLastname(inputs.getLastname());
		physician.setAddress(inputs.getAddress());
		physician.setSiret(inputs.getSiret());
		Specialty specialty = specialtyRepository.getById(inputs.getSpecialtyId());
		physician.setSpecialty(specialty);
		repository.save(physician);
			
	}

	@Override
	public List<Physician> getPhysician() {
		// TODO Auto-generated method stub
		return repository.findAllProjectedBy(Physician.class);
	}

	@Override
	public Optional<Physician> getById(Long id) {
		return repository.findById(id);
	}
	
 /*	@Transactional
	
	public Object findAll() {
		return repository.findAllProjectedBy(PhysicianCreate.class);
	}*/
	
	public Physician updatePhysician(PhysicianCreate inputs) {
		Physician physician = new Physician();
		physician.setFirstname(inputs.getFirstname());
		physician.setLastname(inputs.getLastname());
		physician.setAddress(inputs.getAddress());
		physician.setSiret(inputs.getSiret());
		Specialty specialty = specialtyRepository.getById(inputs.getSpecialtyId());
		physician.setSpecialty(specialty);
		repository.save(physician);
		return physician;
			
	}

	@Override
	public Physician updatePhysicianById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePhysicianById(Long id, PhysicianUpdate physician) {
		// TODO Auto-generated method stub
		//1 récupération du physician 
		Physician oldPhysician = repository.getById(id);
		
		oldPhysician.setFirstname(physician.getFirstname());
		oldPhysician.setLastname(physician.getLastname());
		oldPhysician.setAddress(physician.getAddress());
		oldPhysician.setSiret(physician.getSiret());
		Specialty specialty = specialtyRepository.getById(physician.getSpecialtyId());
		oldPhysician.setSpecialty(specialty);
		
		repository.save(oldPhysician);
	}
	
	//@Override
	// public Physician getById(Long id) {
	  //  return repository.findById(id).get();

	    //}
	
	@Override
	@Transactional
	 public void deletePhysicianById(Long id) {
	
		repository.deleteById(id);
	}


}
