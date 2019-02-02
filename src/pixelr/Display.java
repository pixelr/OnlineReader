package pixelr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Display {
    private Book book;
    private User user;
    private int pageNumber;

    public void display() {
        if (user != null && book != null) {
            System.out.println(user + "is reading " + book + "at page" + pageNumber);
        }
    }

    public void incrementPage() {
        if (book.getNoOfPages() != null && pageNumber > book.getNoOfPages())
            return;
        pageNumber++;

    }

    public void decrementPage() {
        if (pageNumber == 0)
            return;
        pageNumber--;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
