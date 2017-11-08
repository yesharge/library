package library;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private Long authorId;
	
	private String firstName;
	private String lastName;
	
	@ManyToMany (mappedBy = "authors")
	private Set<Book> books;
	
	
	
	protected Author () {
		
	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Set<Book> getBooks() {
		return books;
	}
	@Override
	public String toString() {
		return String.format("Author[firstName='%s', lastName='%s']", firstName, lastName);
}
}
