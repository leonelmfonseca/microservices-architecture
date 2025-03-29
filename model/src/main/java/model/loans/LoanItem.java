package model.loans;

import model.authors.Author;
import model.books.Book;
import model.genres.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LoanItem {
    
    private UUID bookId;
    private String title;
    private String isbn;
    private Genre genre;
    private List<Author> authors;
    
    public LoanItem(Book book) {
        this.bookId = book.getId();
        this.title =book.getTitle();
        this.isbn =book.getIsbn();
        this.genre = book.getGenre();
        this.authors = new ArrayList<>();
        this.authors.addAll(book.getAuthors());
    }
}
