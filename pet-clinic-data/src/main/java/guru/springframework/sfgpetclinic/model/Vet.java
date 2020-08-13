package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {

	private Set<Speciality> specialitites;

	public Set<Speciality> getSpecialitites() {
		return specialitites;
	}

	public void setSpecialitites(Set<Speciality> specialitites) {
		this.specialitites = specialitites;
	}

}
