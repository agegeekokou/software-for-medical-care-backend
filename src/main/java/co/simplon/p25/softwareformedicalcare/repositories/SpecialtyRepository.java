package co.simplon.p25.softwareformedicalcare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.p25.softwareformedicalcare.entities.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty, Long> {

	//List<Specialty> findAll();

	List<Specialty> findAllProjectedBy(Class<Specialty> class1);
	
}
