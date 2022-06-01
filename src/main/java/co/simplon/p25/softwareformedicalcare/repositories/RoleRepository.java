package co.simplon.p25.softwareformedicalcare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.softwareformedicalcare.entities.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, String>{
	 Role findByName(String name);

}
