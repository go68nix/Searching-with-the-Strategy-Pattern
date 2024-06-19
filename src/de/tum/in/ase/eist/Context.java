package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Context {
    private List<Chapter> book;
    private SearchStrategy searchAlgorithm;
    public Context() {

    }

    public Context(List<Chapter> book, SearchStrategy searchAlgorithm) {
        this.book = book;
        this.searchAlgorithm = searchAlgorithm;
    }

    public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }

    public SearchStrategy getSearchAlgorithm() {
        return searchAlgorithm;
    }

    public List<Chapter> getBook() {
        return book;
    }

    public void setBook(List<Chapter> book) {
        this.book = book;
    }
    public int search(String a) {
        return searchAlgorithm.performSearch(book, a);
    }
    public boolean isChaptersSortedByName() {
        List<Chapter> a = new ArrayList<>(book);
        a.sort(Comparator.comparing(Chapter::getName));
        return a.equals(book);
    }

}
