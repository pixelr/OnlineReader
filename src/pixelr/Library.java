package pixelr;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Library {

    Map<Integer, Book> books;

    public Library(){
        books = new HashMap<>();
    }

    public void addBook(int id, Book b){
        books.put(id, b);
    }

    public void removeBook(int id){
        books.remove(id);
    }

    public Optional<Book> findBook(int id) throws Exception{
        if(!books.containsKey(id)){
            throw new Exception("No book found with this id");
        }
        return Optional.of(books.get(id));
    }
}

