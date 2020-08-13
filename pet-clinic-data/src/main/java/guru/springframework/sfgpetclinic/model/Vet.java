package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

	private Set<Speciality> specialitites = new HashSet<>();

	public Set<Speciality> getSpecialitites() {
		return specialitites;
	}

	public void setSpecialitites(Set<Speciality> specialitites) {
		this.specialitites = specialitites;
	}

}
