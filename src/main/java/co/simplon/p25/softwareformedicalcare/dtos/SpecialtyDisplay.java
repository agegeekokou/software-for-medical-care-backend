package co.simplon.p25.softwareformedicalcare.dtos;

public class SpecialtyDisplay {
	private String name;
	
	public SpecialtyDisplay() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SpecialtyDisplay [name=" + name + "]";
	}
	
}
