package com.nacorpio.life.api.human.identity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Identity {

	private String firstName;
	private String middleName;
	private String lastName;
	
	private GregorianCalendar birthDate;

	public Identity(String par1, String par2, String par3) {
		this.firstName = par1;
		this.middleName = par2;
		this.lastName = par3;
	}
	
	public final String getFirstName() {
		return firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final int getAge() {
		return (new GregorianCalendar().get(Calendar.YEAR) - birthDate.get(Calendar.YEAR));
	}
	
	public final String getSsn() {
		return birthDate.get(Calendar.YEAR)+""+birthDate.get(Calendar.MONTH)+""+birthDate.get(Calendar.DAY_OF_MONTH);
	}

	public final GregorianCalendar getBirthDate() {
		return birthDate;
	}

}
