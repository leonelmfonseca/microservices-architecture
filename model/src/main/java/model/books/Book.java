package model.books;

import model.authors.Author;
import model.genres.Genre;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
public class Book {

  private UUID id;

  private String title;

  private String isbn;

  private Genre genre;

  private List<Author> authors;
}
