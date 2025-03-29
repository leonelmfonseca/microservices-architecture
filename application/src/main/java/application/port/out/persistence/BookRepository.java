package application.port.out.persistence;

import java.awt.print.Book;
import java.util.List;

public interface BookRepository {
    List<Book> findAll();
}
