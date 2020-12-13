package bootstrap;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import domain.Author;
import domain.Book;
import repositories.AuthorRepo;
import repositories.BookRepo;

    
@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepo authorRepo;
	private final BookRepo bookRepo;
	
	
	public BootStrapData(AuthorRepo authorRepo, BookRepo bookRepo) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}


	@Override
	public void run(String... args) throws Exception {
		
		Author ella = new Author("Ella", "Cheich");
		Author isaiah = new Author("Isaiah", "Cheich");
		Author sam = new Author("Sam", "Cheich");
		
		Set<Author> authors = new HashSet<Author>();
		authors.add(ella);
		authors.add(isaiah);
		authors.add(sam);
		
		Book sAndS = new Book("kid book", "1234");
		Book happyDays = new Book("kid book", "1234");
	
		ella.getBooks().add(happyDays);
		happyDays.getAuthors().add(ella);
		
		authorRepo.save(ella);
		bookRepo.save(happyDays);
		
		authorRepo.save(sam);
		bookRepo.save(sAndS);
		
		System.out.println("Started in Bootstrap!!!!!!!!!!!!!!!");
		System.out.println("Number of Books" + bookRepo.count());
	
	}

}
