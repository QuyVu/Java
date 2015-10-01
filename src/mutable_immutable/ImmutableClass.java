package mutable_immutable;

import java.util.Date;

public final class ImmutableClass {

	private String first_name;
	private String last_name;
	private Date dateOfBirth;

	public ImmutableClass(String first_name, String last_name, Date dob) {
		this.first_name = first_name;
		this.last_name = last_name;
		dateOfBirth = new Date(dob.getTime());
		//dateOfBirth = dob;
	}

	public String getFirstName() {
		return first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public Date getDateOfBirth() {
		//return dateOfBirth;
		return new Date(dateOfBirth.getTime());
	}
}
