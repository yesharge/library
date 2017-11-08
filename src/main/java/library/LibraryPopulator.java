package library;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryPopulator implements CommandLineRunner{

	@Resource 
	private BookRepository bookRepo;
	
	@Resource
	private AuthorRepository authorRepo;
	
	@Resource
	private GenreRepository genreRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Genre fiction = new Genre ("Fiction");
		genreRepo.save(fiction);
		Genre nonFiction = new Genre ("Non-Fiction");
		genreRepo.save(nonFiction);
		Author kathy = new Author ("Kathy", "Sierra");
		authorRepo.save(kathy);
		Author bert = new Author("Bert", "Bates");
		authorRepo.save(bert);
		Author elisabeth = new Author("Elisabeth", "Freeman");
		authorRepo.save(elisabeth);
		Author clifford = new Author ("Clifford", "Stoll");
		authorRepo.save(clifford);
		bookRepo.save( new Book ("Head First Design Patterns", nonFiction, kathy, bert));
		bookRepo.save(new Book ("Head First Java", nonFiction, kathy, elisabeth));
		bookRepo.save( new Book ("The Cuckoo's Egg", fiction, clifford));
		
	}
}
