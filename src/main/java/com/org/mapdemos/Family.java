package com.org.mapdemos;

public class Family {

	
	private String Name;
	private String Surname;
	
	Family(String name,String surname)
	{
		this.Name=name;
		this.Surname=surname;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Surname == null) ? 0 : Surname.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "[Name=" + Name + ", Surname=" + Surname + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Family other = (Family) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Surname == null) {
			if (other.Surname != null)
				return false;
		} else if (!Surname.equals(other.Surname))
			return false;
		return true;
	}
	
	
	
}

