package co.simplon.p25.softwareformedicalcare.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.softwareformedicalcare.dtos.PhysicianCreate;
import co.simplon.p25.softwareformedicalcare.entities.Physician;


@Repository
public interface PhysicianRepository extends JpaRepository<Physician, Long>{
	
	Optional <Physician> findById(Long id);
	//Object findAllProjectedBy(Class<PhysicianCreate> class1);
	<T>List<T> findAllProjectedBy(Class<T> type);
	
}
