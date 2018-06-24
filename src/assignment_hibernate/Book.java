package assignment_hibernate;

import java.util.*;

import javax.persistence.*;

@Entity
public class Book {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bid;
	
	private String Bname;
	
	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="a_ids")
	private Author authors;
	
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}
	
	

	public	Author getAuthors() {
		return  authors;
	}

	public void setAuthors(Author authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", Bname=" + Bname + "]";
	}
	
	
	

}
