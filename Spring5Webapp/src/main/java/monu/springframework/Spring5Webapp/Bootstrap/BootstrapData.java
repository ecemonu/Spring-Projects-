package monu.springframework.Spring5Webapp.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import monu.springframework.Spring5Webapp.domain.Author;
import monu.springframework.Spring5Webapp.domain.Book;
import monu.springframework.Spring5Webapp.domain.Publisher;
import monu.springframework.Spring5Webapp.repositories.AuthorRepository;
import monu.springframework.Spring5Webapp.repositories.BookRepository;
import monu.springframework.Spring5Webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository pubRepository;
	

	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository pubRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.pubRepository = pubRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		
		
		Author monu =new Author("monu", "chandramohan");
		Book ddd = new Book("Domain driven design ", "1234");
		monu.getBooks().add(ddd);
		ddd.getAuthor().add(monu);
		authorRepository.save(monu);
		bookRepository.save(ddd);
		
		Author dpk =new Author("deepak", "ramasamy");
		Book tdd = new Book("test driven design ", "1s234");
		dpk.getBooks().add(tdd);
		tdd.getAuthor().add(dpk);
		authorRepository.save(dpk);
		bookRepository.save(tdd);
		
		Publisher pub = new Publisher();
		pub.setAddressLine1("xxx");
		pub.setCity("che");
		pub.setState("TN");
		pub.setZip("60028");
		pubRepository.save(pub);
		
		System.out.println("Started in bootstrap..");
		System.out.println("No of books : "+bookRepository.count());
		System.out.println("No of author : "+authorRepository.count());
		System.out.println("No of publishers : "+pubRepository.count());
		
		
	}

}
