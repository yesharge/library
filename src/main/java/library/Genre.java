package library;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private Long genreId;
	private String genre;
	
	@OneToMany(mappedBy ="genre")
	private Set<Book> books;
	
	
	
	protected Genre() {
	}
	
	public Genre (String genre) {
		this.genre = genre;
	}

	public Long getGenreId() {
		return genreId;
	}


	public Set<Book> getBooks() {
		return books;
	}

	public String getGenre() {
		return genre;
	}
	@Override
	public String toString() {
		return String.format("Genre[genre='%s']", genre);
	
}
}
