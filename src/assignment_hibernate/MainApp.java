package assignment_hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class MainApp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Author.class).addAnnotatedClass(Book.class);
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg); 		//interface so no object 
		
		Session session = sf.openSession();		//interface so no object 
		 
		Transaction tx = session.beginTransaction();
		 
		 
			 Book b = new Book();
			 b.setBid(15);
			 
			 System.out.println("Enter book name :");
			 b.setBname(in.next());
			 
		 
			 AuthorName aname = new AuthorName();
			 Author a = new Author();
			 
			 System.out.println("Enter Author First name :");
			 aname.setFname(in.next());
			 
			 System.out.println("Enter Author Last name :");
			 aname.setLname(in.next());
			 
			 a.setName(aname);
			 
			 System.out.println("Enter age of Author :");
			 a.setAge(in.nextInt());
			 
			 a.getBooks().add(b);
			 
			 
			 session.save(a);
			 session.save(b);
			 
			 
			 a = (Author) session.get(Author.class, 1);
			 System.out.println(a);
			 
			 Book b1 = (Book) session.get(Book.class, 15);
			 b1.setBname("Second Book");
			 
			 session.update(b1);
			 session.save(b1);
			 
			 System.out.println("Updating the book name");
			 a = (Author) session.get(Author.class, 1);
			 System.out.println(a);
		 
		 tx.commit();
		 session.close();

	}

}
