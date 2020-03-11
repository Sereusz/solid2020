package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer {
    private int currentPage = 0;
    private Book book;

    public String getCurrentPageContents() {
        return book.getPageContents(currentPage);
    }

    public Printer(Book book){
        this.book = book;
    }

    public void turnPage() {
        currentPage ++;
    }

    /**
     * Prints the current page.
     */
    public void printCurrentPage() {
        System.out.println(getCurrentPageContents());
    }

    /**
     * Prints all pages
     * @return
     */
    public String printAllPages() {

        StringBuilder allPages = new StringBuilder();
        for(Map.Entry<Integer, String> page : book.getAllPages()) {
            allPages.append(page.getKey()).append(" ").append(page.getValue());
        }
        return  allPages.toString();
    }
}
