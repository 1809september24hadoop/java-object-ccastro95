package com.revature.object;

import org.apache.log4j.Logger;

public abstract class Character {

	private static final Logger LOGGER = Logger.getLogger(Character.class);

	private int age;
	private boolean isMale;
	private String firstName;
	private String lastName;

	public Character() {
		LOGGER.trace("Don't mind me, just creating a character.");
		firstName = "";
		lastName = "";
	}

	public Character(boolean isMale) {
		this();
		LOGGER.trace("This character is the villain, whose name you are not supposed to know.");
		this.isMale = isMale;
	}

	public Character(int age, boolean isMale, String firstName, String lastName) {
		this();
		LOGGER.trace("This character will have everything filled in (minus maybe a name if applicable).");
		this.age = age;
		this.isMale = isMale;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public abstract void greeting();

	public abstract void replyGreeting();

	public void communicate(String message) {
		if(this.getFirstName().isEmpty()) {
			if(this.getLastName().isEmpty()) {
				LOGGER.info("Dragon: " + message);	
			} else {
				LOGGER.info(this.getLastName() + ": " + message);
			}
		} else {
			LOGGER.info(this.getFirstName() + ": " + message);
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (isMale ? 1231 : 1237);
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (isMale != other.isMale)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Character [age=" + age + ", isMale=" + isMale + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}	
}
