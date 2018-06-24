package assignment_hibernate;

import javax.persistence.*;

@Entity
public class Book {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bid;
	
	private String Bname;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Author authors ;

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
	
	public Author getAuthor() {
		return authors;
	}

	public void setAuthor(Author author) {
		this.authors = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", Bname=" + Bname + ", authors=" + authors.getName() + "]";
	}
	
	

	
	
	

}
