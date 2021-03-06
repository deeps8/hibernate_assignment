package assignment_hibernate;

import java.util.*;

import javax.persistence.*;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	
	private AuthorName name;
	
	private int age;

	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="b_ids")
	private List<Book> books= new ArrayList<>();
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public AuthorName getName() {
		return name;
	}

	public void setName(AuthorName name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", age=" + age + ", books=" + books+ "]";
	}

	

	
	
	
}
