package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch implements SearchStrategy {
    @Override
    public int performSearch(List<Chapter> book, String name) {
        for (Chapter a: book) {
            if (a.getName().equals(name)) {
                return a.getPageNumber();
            }
        }
        return -1;
    }
}
