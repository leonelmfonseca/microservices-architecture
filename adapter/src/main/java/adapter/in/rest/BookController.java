package adapter.in.rest;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

  @GetMapping
  public List<model.books.Book> getBooks() {
    model.books.Book book = new model.books.Book();
    return List.of(book);
  }
}
