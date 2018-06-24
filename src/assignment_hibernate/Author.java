package assignment_hibernate;

import javax.persistence.*;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	
	private AuthorName name;
	
	private int age;

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

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
