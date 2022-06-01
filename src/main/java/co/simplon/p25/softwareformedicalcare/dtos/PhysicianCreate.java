package co.simplon.p25.softwareformedicalcare.dtos;

public class PhysicianCreate {
	
	private String firstname;
	private String lastname;
	private Long specialtyId;
	private String address;
	private String siret;
	
	public PhysicianCreate() {
		
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
	
	
	public Long getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(Long specialtyId) {
		this.specialtyId = specialtyId;
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

	@Override
	public String toString() {
		return "PhysicianCreate [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", siret=" + siret + "]";
	}
	
	
}
