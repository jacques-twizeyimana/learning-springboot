package learner.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1l,"Mastering spring","Sandberg"));
    }

    @PostMapping("/books")
    public Book insertBooks(Book newBook){
        return newBook;
    }
}
