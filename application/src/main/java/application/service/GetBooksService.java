package application.service;

import application.port.in.book.GetBooks;
import application.port.out.persistence.BookRepository;
import java.awt.print.Book;
import java.util.List;

public class GetBooksService implements GetBooks {

  private final BookRepository bookRepository;

  public GetBooksService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public List<Book> findAll() {
    return bookRepository.findAll();
  }
}
