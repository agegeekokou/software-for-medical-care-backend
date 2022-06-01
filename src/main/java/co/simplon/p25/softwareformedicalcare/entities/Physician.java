package co.simplon.p25.softwareformedicalcare.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "physicians")
public class Physician {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name= "firstname")
	private String firstname;
	
	@Column (name= "lastname")
	private String lastname;
	
	@Column (name= "address")
	private String address;
	
	@Column (name= "siret")
	private String siret;
	
	@ManyToOne
	@JoinColumn (name= "specialty_id")
	private Specialty specialty;
	
	@OneToOne
	@JoinColumn (name= "user_id")
	private User user;
	
	public Physician() {
		
	}

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getSiret() {
		return siret;
	}



	public void setSiret(String siret) {
		this.siret = siret;
	}



	public Specialty getSpecialty() {
		return specialty;
	}



	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Physician [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", siret=" + siret + ", specialty=" + specialty + ", user=" + user + "]";
	}

	
	
	
}
