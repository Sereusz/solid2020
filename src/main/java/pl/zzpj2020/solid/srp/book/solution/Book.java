package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Book {
    private Map<Integer, String> pages = new HashMap<>();

    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    /**
     * Gives contents of a specific page
     *
     * @return
     */

    public String getPageContents(int pageNumber){
        return pages.get(pageNumber);
    }

    /**
     * Gives the library name
     *
     * @return
     */
    public String libraryRoomName() {
        return libraryRoomName;
    }

    /**
     * Gives the row location of the book.
     * @return
     */
    public String getLocationRowLocator() {
        return rowLocator;
    }

    /**
     * Gives the number from shelf.
     * @return
     */
    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    /**
     * Returns all pages
     * @return
     */

    public Set<Map.Entry<Integer, String>> getAllPages(){
        return pages.entrySet();
    }

}
