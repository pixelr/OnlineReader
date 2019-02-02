package pixelr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Book {
    private String name;
    private String Author;
    private String genre;
    private Integer noOfPages;

    public Book(String name, String author, String genre) {
        this.name = name;
        Author = author;
        this.genre = genre;
    }

    public Integer getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(Integer noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
