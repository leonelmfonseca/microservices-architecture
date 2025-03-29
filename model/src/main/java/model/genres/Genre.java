package model.genres;

import model.books.Book;
import java.util.List;
import java.util.UUID;

public class Genre {

  private UUID id;

  private String name;

  private List<Book> books;
}
