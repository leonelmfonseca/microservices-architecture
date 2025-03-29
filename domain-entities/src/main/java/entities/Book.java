package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  @ManyToMany
  //    @JoinTable(
  //            name = "book_authors",
  //            joinColumns = @JoinColumn(name = "book_id"),
  //            inverseJoinColumns = @JoinColumn(name = "author_id")
  //    )
  private List<Author> author;

  private String isbn;

  @ManyToOne
  @JoinColumn(name = "genre_id")
  private Genre genre;

  @ManyToMany private List<Author> authors;
}
