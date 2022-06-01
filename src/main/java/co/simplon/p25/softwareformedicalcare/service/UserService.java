package co.simplon.p25.softwareformedicalcare.service;

import co.simplon.p25.softwareformedicalcare.dtos.UserCreate;
import co.simplon.p25.softwareformedicalcare.dtos.UserLogin;
import co.simplon.p25.softwareformedicalcare.security.Jwt;




public interface UserService {
	

	void create(UserCreate inputs);

	

	Jwt signIn(UserLogin inputs);

	
}
