package com.org.arraylistdemos;

public class Family {

	private String Name;
	private String Surname;
	private String Address;
	
	Family(String name,String surname,String address)
	{
		this.Name=name;
		this.Surname=surname;
		this.Address=address;
	}

	@Override
	public String toString() {
		return "[Name=" + Name + ", Surname=" + Surname + ", Address="
				+ Address + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	
	
}
