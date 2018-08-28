package com.soft.slk.training.model;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Joiner;

public class PersonCustomer extends Customer {
	private Date birthDate;
	private String firstName;
	private String lastName;

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getName() {
		return Joiner.on(StringUtils.SPACE).skipNulls().join(this.firstName, this.lastName);
	}


}
