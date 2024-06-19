package de.tum.in.ase.eist;

import java.util.List;

public class BinarySearch implements SearchStrategy {
    @Override
    public int performSearch(List<Chapter> book, String name) {
        return binarySearch(book, name);
    }
    private int binarySearch(List<Chapter> book, String name) {
        int left = 0;
        int right = book.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int cmp = book.get(mid).getName().compareTo(name);

            if (cmp == 0) {
                return book.get(mid).getPageNumber();
            }
            if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
