package co.simplon.p25.softwareformedicalcare.service;





import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.p25.softwareformedicalcare.dtos.UserCreate;
import co.simplon.p25.softwareformedicalcare.dtos.UserLogin;
import co.simplon.p25.softwareformedicalcare.entities.Role;
import co.simplon.p25.softwareformedicalcare.entities.User;
import co.simplon.p25.softwareformedicalcare.repositories.RoleRepository;
import co.simplon.p25.softwareformedicalcare.repositories.UserRepository;
import co.simplon.p25.softwareformedicalcare.security.Jwt;
import co.simplon.p25.softwareformedicalcare.security.JwtProvider;

@Service
public class UserServiceImpl implements UserService{
	private final UserRepository repository;
	
	private final RoleRepository roleRepository;

    private final PasswordEncoder encoder;

    private final JwtProvider provider;

    public UserServiceImpl(UserRepository repository, PasswordEncoder encoder,
	    JwtProvider provider, RoleRepository roleRepository) {
	this.repository = repository;
	this.encoder = encoder;
	this.provider = provider;
	this.roleRepository = roleRepository;
    }

    @Transactional
    @Override
    public void create(UserCreate inputs) {
	User user = new User();
	user.setUsername(inputs.getUsername());
	Role role = roleRepository.findByName(inputs.getRoleName());
	user.setUserRole(role);
	String encoded = encoder.encode(inputs.getPassword());
	user.setPassword(encoded);
	repository.save(user);
    }
    
    

    @Override
    public Jwt signIn(UserLogin inputs) throws BadCredentialsException {
	String username = inputs.getUsername();
	User user = repository.findByUsernameIgnoreCase(username)
		.orElseThrow(() -> new BadCredentialsException(String
			.format("no user found with username '%s'", username)));
	String password = inputs.getPassword();
	if (!encoder.matches(password, user.getPassword())) {
	    throw new BadCredentialsException(String.format(
		    "password does not match for username '%s'", username));
	}
	Role role = user.getUserRole();
	List<String> roles = null;
	if (role != null) {
	    roles = List.of(role.getName());
	}
	return provider.create(String.valueOf(user.getId()), roles);
    }

	
}
