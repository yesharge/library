package library;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {

	@Resource
	BookRepository bookRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	AuthorRepository authorRepo;

	
	@RequestMapping("/books")
	public String getAllBooks (Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}
	
	@RequestMapping("/authors")
	public String getAllAuthors (Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "authors";
	}
	@RequestMapping("/author")
	public String getOneAuthor(@RequestParam Long id, Model model) {
		model.addAttribute("author", authorRepo.findOne(id));
		return "author";
	}
	@RequestMapping("/genres")
	public String getAllGenres (Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genres";
}
	
}
