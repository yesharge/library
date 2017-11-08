package library;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long bookId;
	
	private String title;
	
	@ManyToOne
	private Genre genre;
	
	@ManyToMany
	private  Set<Author> authors = new HashSet<Author>();
	

	protected Book() {
		
	}
	public Book(String title, Genre genre, Author... author) {
		this.title = title;
		this.genre = genre;
		this.authors = new HashSet<Author>(Arrays.asList(author));
	}
	public Long getBookId() {
		return bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Genre getGenre() {
		return genre;
	}
	public Set<Author> getAuthor() {
		return authors;
	}
	
	
	@Override
	public String toString() {
		return String.format("Book[title='%s', genre='%s', author='%s']", title, genre, authors);
}
}
