package pixelr;

import java.util.Optional;

public class OnlineReader {
    private Library library;
    private UserManager userManager;
    private Display display;

    public OnlineReader(Library library, UserManager userManager) {
        this.library = library;
        this.userManager = userManager;
    }

    private Book currentBook;
    private User currentReader;

    public void setCurrentBookAndReade(int bookId, int userId) throws Exception {
        Optional<Book> bookO = library.findBook(bookId);
        Optional<User> userO = userManager.findUser(userId);
        if (!bookO.isPresent() || !userO.isPresent())
            throw new Exception("not found");
        bookO
                .ifPresent(book -> this.currentBook = book);
        userO
                .ifPresent(user -> this.currentReader = user);
        display = new Display();
        display.setBook(this.currentBook);
        display.setUser(this.currentReader);
    }

    public Display getDisplay() {
        return display;
    }

}
