package media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book() {
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author's name is already in the book");
            return;
        }

        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Author's name not in the book");
            return;
        }

        authors.remove(authorName);
    }
}