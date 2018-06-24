package assignment_hibernate;

import java.util.*;

import javax.persistence.*;

@Entity
public class AuthorAddress {
	
	@Id
	private int add_id;
	
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Author> authors = new ArrayList<>();
	
	public int getAdd_id() {
		return add_id;
	}

	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "AuthorAddress [add_id=" + add_id + ", address=" + address + ", authors=" + authors + "]";
	}

	
	
	

}
