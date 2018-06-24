package assignment_hibernate;

import java.util.*;

import javax.persistence.*;

@Entity
public class Book {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bid;
	
	private String Bname;
	
	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="a_ids")
	private List<Author> authors = new ArrayList<>();
	
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
	
	

	public	List<Author> getAuthors() {
		return  authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", Bname=" + Bname + "]";
	}
	
	
	

}
